package com.example.myproject.rest.controller;

import com.example.myproject.rest.entity.Customer;
import com.example.myproject.rest.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class CustomerController {


    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> showAllCustomers(){
        // if product in db add to cart
        //else throw exception

        return customerService.getAllCustomer();
    }

    @PostMapping("/customers")
    public Customer addNewCustomer(@RequestBody Customer customer){
        customerService.saveCustomer(customer);
        return customer;
    }

    @PutMapping("/customers")
    public Customer updateCustomer(@RequestBody Customer customer){
        customerService.saveCustomer(customer);
        return customer;

    }
    @DeleteMapping("/customers/{id}")
    public String deleteCustomer(@PathVariable int id){
        customerService.deleteCustomer(id);
        return "Customer with ID = " + id + "was deleted";

    }

}
