package com.macy.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.macy.entity.FulFillmentOrderEntity;

public interface OrderFulFillmentRepo extends JpaRepository<FulFillmentOrderEntity, Integer>{

}
