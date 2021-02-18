package com.foodorderingsystem.orderingservice.repository;

import com.foodorderingsystem.orderingservice.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, Integer> {}
