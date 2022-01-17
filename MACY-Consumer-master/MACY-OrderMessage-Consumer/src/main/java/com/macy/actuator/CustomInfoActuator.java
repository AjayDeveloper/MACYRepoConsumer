package com.macy.actuator;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import com.macy.repo.OrderConsumerRepo;
import com.macy.repo.OrderFulFillmentRepo;

@Component
public class CustomInfoActuator implements InfoContributor{

	@Autowired
	OrderFulFillmentRepo xmlRepo;
	@Autowired
	OrderConsumerRepo jsonRepo;
	
	@Override
	public void contribute(Builder builder) {
		
		long recordJson = jsonRepo.count();
		long recordxml = xmlRepo.count();
		
		HashMap<String, Long> hashMap = new HashMap<String, Long>();
		hashMap.put("Json Order", recordJson);
		hashMap.put("Xml Order", recordxml);
		
		builder.withDetail("Order DB Info", hashMap);
	}

}
