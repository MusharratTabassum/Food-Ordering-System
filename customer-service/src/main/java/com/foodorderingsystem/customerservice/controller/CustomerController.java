package com.foodorderingsystem.customerservice.controller;

import com.foodorderingsystem.customerservice.exception.ResourceDoesNotExistsException;
import com.foodorderingsystem.customerservice.model.Customer;
import com.foodorderingsystem.customerservice.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customers")

public class CustomerController {
    public CustomerService customerService;
    public CustomerController(CustomerService customerService) {

        this.customerService = customerService;
    }
    @GetMapping("")
    public ResponseEntity<List<Customer>> getCustomers() {
        List<Customer> customerList = customerService.findAll();
        return ResponseEntity.ok(customerList);
    }
    @GetMapping("/{customer_id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable("customer_id") int customer_id) throws ResourceDoesNotExistsException {
        Customer customer = customerService.findById(customer_id);
        return ResponseEntity.ok(customer);
    }
    @PostMapping("/")
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        try {
            Customer createdProduct = customerService.create(customer);
            return new ResponseEntity<>(createdProduct, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
    @PutMapping("/{newId}")
    public ResponseEntity<Customer> updatedCustomer(@PathVariable("newId") int newId, @RequestBody Customer customer) {
        Customer updatedCustomer = customerService.update(newId, customer);
        if(updatedCustomer != null){
            return new ResponseEntity<>(updatedCustomer, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/{customer_id}")
    public ResponseEntity<HttpStatus> deleteCustomer(@PathVariable("customer_id") int customer_id) {
        Boolean deleted = customerService.deleteById(customer_id);
        if(deleted){
            return new ResponseEntity<>(HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
}
