package com.foodorderingsystem.orderingservice.service;

import com.foodorderingsystem.orderingservice.exception.ResourceDoesNotExistsException;
import com.foodorderingsystem.orderingservice.model.Order;
import com.foodorderingsystem.orderingservice.model.Product;
import com.foodorderingsystem.orderingservice.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class OrderService {
    OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> findAll() {
        List<Order>orderList = new ArrayList<>();
        orderRepository.findAll().forEach(orderList::add);
        return orderList;
    }

    public Order findById(int id) throws ResourceDoesNotExistsException {
        List<Order> orderList = orderRepository.findAll();
        Order order = null;
        for (Order o : orderList){
            if(id == o.getOrder_id()){
                order = o;
                break;
            }
        }
        return order;
    }
//    public void OrderedProductTotalPrice(){
//
//        double total_amount=0;
//        for(Product p:productList){
//
//            total_amount+=p.getQuantity()*p.getPrice();
//        }
//    }
    public Order placeOrder(Order order) {
        order.setOrderTime(System.currentTimeMillis());
        order.setTotalPrice(order.getItems().stream().mapToInt(e -> {
            return (int) (e.getPrice() * e.getQuantity());
        }).sum());
    return orderRepository.save(order);
    }




}
