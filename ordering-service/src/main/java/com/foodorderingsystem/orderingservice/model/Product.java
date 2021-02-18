package com.foodorderingsystem.orderingservice.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Product {

    @Id
    private int product_id;
    private String product_name;
    private String product_type;
    private String description;
    private double quantity;
    private double price;


    public Product(String product_name,double quantity, double price) {
        this.product_name=product_name;
        this.quantity = quantity;
        this.price = price;
    }


}
