package com.macy.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import com.macy.dto.FulFillmentOrder;
import com.macy.dto.OrderJsonDto;

public interface ConsumerService {

	public ResponseEntity<List<OrderJsonDto>> getOrderFromQueueJson();
	public ResponseEntity<List<FulFillmentOrder>> getOrderFromQueueXml();

}
