package com.foodorderingsystem.customerservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Address {

    private String address;
    private String City;
    private String zip_code;

}
