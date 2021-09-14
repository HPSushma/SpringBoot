package com.example.demo.customers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @RequestMapping("/customers")
    public List<Customers> getCustomers(){
        return customerService.getAllCustomers();
    }
    @GetMapping
    @RequestMapping("/customers/{customerId}")
    public Customers getCustomer(@PathVariable Long customerId){
        return customerService.getCustomer(customerId);
    }
    @RequestMapping(method=RequestMethod.POST, value = "/customers")
    public void addCustomer(@RequestBody Customers customer){
        customerService.addCustomer(customer);
    }
    @RequestMapping(method = RequestMethod.PUT, value="/customers/{customerId}")
    public void updateCustomer(@RequestBody Customers customer, @PathVariable Long customerId){
        customerService.updateCustomer(customer, customerId);
    }
    @RequestMapping(method =RequestMethod.DELETE, value="/customers/{customerId}")
    public void deleteCustomer(@PathVariable Long customerId){
        customerService.delCustomer(customerId);
    }

}
