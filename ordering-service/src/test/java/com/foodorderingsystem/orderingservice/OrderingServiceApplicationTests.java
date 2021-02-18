package com.foodorderingsystem.orderingservice;

import com.foodorderingsystem.orderingservice.model.Address;
import com.foodorderingsystem.orderingservice.model.CustomerInfo;
import com.foodorderingsystem.orderingservice.model.Order;
import com.foodorderingsystem.orderingservice.model.Product;
import com.foodorderingsystem.orderingservice.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class OrderingServiceApplicationTests {

    @Autowired
    OrderService orderService;
    @Test
    void contextLoads() {
    }

    @Test
    void create(){
//        List<Product>products=new ArrayList<>();
//        List<CustomerInfo>customers=new ArrayList<>();
//        products.add(new Product(12,2.5,350));
//        products.add(new Product(233,1.0,450));
//        customers.add(new CustomerInfo(9845,"+880129889656","28 north bashaboo,Dhaka-1242"));
//        Order order=new Order(23, LocalDate.of(2021, Month.APRIL, 20),"available",products,customers);
//        orderService.create(order);
//        System.out.println(order);
    }

    @Test
    void created(){

//     List<Product>products=new ArrayList<>();
//     List<Order>orders=new ArrayList<>();
//     List<Address>addresses=new ArrayList<>();
//     products.add(new Product("Burger",1,350));
//     products.add(new Product("Cocacola",1,70));
//     addresses.add(new Address("24 North Khilgoan","Dhaka","124/A"));
//     Order order=new Order(1245,420,5,6,"21C4A",products,new CustomerInfo(12,"Lima","Afrin","+880164786565",addresses));
//     orderService.placeOrder(order);
//     System.out.println(order);


    }
}
