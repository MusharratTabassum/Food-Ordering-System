package com.foodorderingsystem.orderingservice.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Order {

    private int order_id;
    private int totalPrice;
    private long orderTime;
    private long deliveryTime;
    private String paymentId;
    private List<Product> items;
    private CustomerInfo customerInfo;

}
