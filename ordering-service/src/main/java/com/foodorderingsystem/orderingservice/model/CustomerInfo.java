package com.foodorderingsystem.orderingservice.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class CustomerInfo {


    private int customer_id;
    private String F_name;
    private String L_name;
    private String phone_no;
    private List<Address>addresses;

}
