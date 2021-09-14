package com.example.demo.customers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customers> getAllCustomers(){
        List<Customers> customer= new ArrayList<>();
        customerRepository.findAll().forEach(customer::add);
        return customer;
    }
    public Customers getCustomer(Long id){
        return customerRepository.findById(id).get();
    }
    public void addCustomer(Customers customer){
        customerRepository.save(customer);
    }
    public void updateCustomer(Customers customer, Long customerId){
        customerRepository.save(customer);
    }

    public void delCustomer(Long id){
        customerRepository.deleteById(id);
    }
}
