package com.macy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.macy.dto.FulFillmentOrder;
import com.macy.dto.OrderJsonDto;
import com.macy.service.ConsumerService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("macy/consumer/")
public class ConsumerController {

	@Autowired
	ConsumerService consumerService;

	@ApiOperation(value = "get order from json queue")
	@GetMapping(value = "json")
	public ResponseEntity<List<OrderJsonDto>> getOrderFromQueueJson() {

		return consumerService.getOrderFromQueueJson();

	}

	@ApiOperation(value = "get order from xml queue")
	@GetMapping(value = "xml")
	public ResponseEntity<List<FulFillmentOrder>> getOrderFromQueueXml() {

		return consumerService.getOrderFromQueueXml();

	}
}
