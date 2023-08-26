package com.example.myproject.rest.service;

import com.example.myproject.rest.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getAllCustomer();

    void saveCustomer(Customer employee);

    Customer getCustomer(int id);

    void deleteCustomer(int id);


}
