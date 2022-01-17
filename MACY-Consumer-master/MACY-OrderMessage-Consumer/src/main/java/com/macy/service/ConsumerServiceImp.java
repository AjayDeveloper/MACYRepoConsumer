package com.macy.service;

import static util.Constant.QUEUE_JSON;
import static util.Constant.QUEUE_XML;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.modelmapper.ModelMapper;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.macy.dto.FulFillmentOrder;
import com.macy.dto.OrderJsonDto;
import com.macy.entity.FulFillmentOrderEntity;
import com.macy.entity.OrderEntity;
import com.macy.exception.DataParseException;
import com.macy.exception.SaveToDatabaseException;
import com.macy.repo.OrderConsumerRepo;
import com.macy.repo.OrderFulFillmentRepo;

@Service
public class ConsumerServiceImp implements ConsumerService {

	@Autowired
	OrderConsumerRepo repo;
	
	@Autowired
	OrderFulFillmentRepo fulFillmentRepo;

	@Autowired
	ModelMapper modelMapper;

	@Autowired
	RabbitAdmin rabbitAdmin;

	@Autowired
	RabbitTemplate rabbitXmlTemplate;

	@Autowired
	RabbitTemplate rabbitJsonTemplate;

	@Override
	public ResponseEntity<List<OrderJsonDto>> getOrderFromQueueJson() {

		Properties properties = rabbitAdmin.getQueueProperties(QUEUE_JSON);
		int count = (Integer) (properties != null ? properties.get(RabbitAdmin.QUEUE_MESSAGE_COUNT) : 0);
		List<OrderJsonDto> orderList = new ArrayList<OrderJsonDto>();

		for (int i = 0; i < count; i++) {

			try {
				OrderJsonDto order = (OrderJsonDto) rabbitJsonTemplate.receiveAndConvert(QUEUE_JSON);

				OrderEntity orderEntity = getOrderEntityFromDto(order);
				OrderEntity affectedEntity = null;

				try {

					affectedEntity = repo.save(orderEntity);
					orderList.add(getOrderDtoFromEntity(affectedEntity));

				} catch (Exception e) {
					e.printStackTrace();
					break;
				} finally {
					if (affectedEntity == null) {
						throw new SaveToDatabaseException();
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
				throw new DataParseException();
			}
		}

		return new ResponseEntity<>(orderList, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<FulFillmentOrder>> getOrderFromQueueXml() {

		Properties properties = rabbitAdmin.getQueueProperties(QUEUE_XML);
		int count = (Integer) (properties != null ? properties.get(RabbitAdmin.QUEUE_MESSAGE_COUNT) : 0);
		List<FulFillmentOrder> orderList = new ArrayList<FulFillmentOrder>();
		
		for (int i = 0; i < count; i++) {

			FulFillmentOrder fulFillmentOrder = (FulFillmentOrder) rabbitXmlTemplate.receiveAndConvert(QUEUE_XML);
			FulFillmentOrderEntity fulFillmentOrderEntity =  getOrderFulFillmentEntityFromDto(fulFillmentOrder);
			FulFillmentOrderEntity affectedEntity = null;
			
			try {

				affectedEntity = fulFillmentRepo.save(fulFillmentOrderEntity);
				orderList.add(getOrderFulFillmentDtoFromEntity(affectedEntity));

			} catch (Exception e) {
				e.printStackTrace();
				break;
			} finally {
				if (affectedEntity == null) {
					throw new SaveToDatabaseException();
				}
			}
		}

		return new ResponseEntity<>(orderList, HttpStatus.OK);
	}

	private OrderEntity getOrderEntityFromDto(OrderJsonDto ordDto) {
		OrderEntity orderEntity = this.modelMapper.map(ordDto, OrderEntity.class);
		return orderEntity;
	}

	private OrderJsonDto getOrderDtoFromEntity(OrderEntity orderEntity) {
		OrderJsonDto orderJsonDto = this.modelMapper.map(orderEntity, OrderJsonDto.class);
		return orderJsonDto;
	}
	
	private FulFillmentOrderEntity getOrderFulFillmentEntityFromDto(FulFillmentOrder ordDto) {
		FulFillmentOrderEntity orderEntity = this.modelMapper.map(ordDto, FulFillmentOrderEntity.class);
		return orderEntity;
	}

	private FulFillmentOrder getOrderFulFillmentDtoFromEntity(FulFillmentOrderEntity orderEntity) {
		FulFillmentOrder orderJsonDto = this.modelMapper.map(orderEntity, FulFillmentOrder.class);
		return orderJsonDto;
	}

}
