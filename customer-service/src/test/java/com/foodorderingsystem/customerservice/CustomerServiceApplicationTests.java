package com.foodorderingsystem.customerservice;

import com.foodorderingsystem.customerservice.model.Address;
import com.foodorderingsystem.customerservice.model.Customer;
import com.foodorderingsystem.customerservice.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class CustomerServiceApplicationTests {


    @Autowired
    CustomerService customerService;
    @Test
    void contextLoads() {
    }
    @Test
    void getAll(){
        List<Customer> customerList = customerService.findAll();
        System.out.println(customerList);
    }

    @Test
    void addCustomer(){

        List<Address>addresses=new ArrayList<>();
//        addresses.add(new Address("25 Kamal Ataturk,Bonani","Dhaka","1246A"));
//        addresses.add(new Address("97/A Rampura","Dhaka","1214"));
//        Customer customer= new Customer(703,"Tanvir","Ahmed","+088128641354",addresses);
//        customerService.create(customer);

//        addresses.add(new Address("162/C Shajahanpur","Dhaka","1215"));
//        addresses.add(new Address("97/A Rampura","Dhaka","1214"));
//        Customer customer1= new Customer(528,"Faisal","Sumon","+088198641354",addresses);
//        customerService.create(customer1);
//
//        addresses.add(new Address("897/12C Khilgoan","Dhaka","1217"));
//        Customer customer= new Customer(124,"Rubaiya","Doula","+088184641354",addresses);*/
//



    }

}
