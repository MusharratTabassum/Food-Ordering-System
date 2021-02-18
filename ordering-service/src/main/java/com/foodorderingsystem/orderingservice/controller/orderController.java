package com.foodorderingsystem.orderingservice.controller;


import com.foodorderingsystem.orderingservice.exception.ResourceDoesNotExistsException;
import com.foodorderingsystem.orderingservice.model.Order;
import com.foodorderingsystem.orderingservice.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/orders")
public class orderController {
    public OrderService orderService;
    public orderController(OrderService orderService) {

        this.orderService = orderService;
    }
    @GetMapping("")
    public ResponseEntity<List<Order>> getOrder() {
        List<Order> orderList = orderService.findAll();
        return ResponseEntity.ok(orderList);
    }
    @GetMapping("/{order_id}")
    public ResponseEntity<Order> getOrderById(@PathVariable("order_id") int order_id) {
        try {
            Order order = orderService.findById(order_id);
            return ResponseEntity.ok(order);
        } catch (ResourceDoesNotExistsException e) {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping("/")
    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
        try {
            Order createdOrder = orderService.placeOrder(order);
            return new ResponseEntity<>(createdOrder, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }


}
