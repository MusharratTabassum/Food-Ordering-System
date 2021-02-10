package com.foodorderingsystem.customerservice.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Customer {

    private Integer customer_id;
    private String F_name;
    private String L_name;
    private String phone_no;
    List<Address>addresses;

}
