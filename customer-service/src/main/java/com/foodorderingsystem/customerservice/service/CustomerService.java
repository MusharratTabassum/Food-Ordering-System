package com.foodorderingsystem.customerservice.service;

import com.foodorderingsystem.customerservice.exception.ResourceDoesNotExistsException;
import com.foodorderingsystem.customerservice.model.Customer;
import com.foodorderingsystem.customerservice.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> findAll() {
        List<Customer>customerList = new ArrayList<>();
        customerRepository.findAll().forEach(customerList::add);
        return customerList;
    }

    public Customer findById(int id){
        List<Customer> customerList = customerRepository.findAll();
        Customer customer = null;
        for (Customer c : customerList){
            if(id == c.getCustomer_id()){
                customer = c;
                break;
            }
        }

        return customer;
    }
    public Boolean deleteById(int id){
       Customer customer = findById(id);

        if(customer != null){
            List<Customer> result = new ArrayList();
            List<Customer> customerList = customerRepository.findAll();

            for (Customer c : customerList){
                if(c.getCustomer_id() != id)
                    result.add(c);
            }

            customerRepository.deleteAll();
            customerRepository.saveAll(result);
            return true;
        }
        else
            return false;
    }

    public Customer create(Customer customer){
        return customerRepository.save(customer);
    }


    public Customer update(int id, Customer customer){
        Optional<Customer> optionalCustomer = customerRepository.findById(id);
        if (optionalCustomer != null) {
            customer.setCustomer_id(id);
            return customerRepository.save(customer);
        }
        else
            return null;
    }
}
