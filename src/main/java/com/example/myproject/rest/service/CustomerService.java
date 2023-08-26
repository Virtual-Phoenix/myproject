package com.example.myproject.rest.service;

import com.example.myproject.rest.entity.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> getAllCustomer();

    public void saveCustomer(Customer employee);

    public Customer getCustomer(int id);

    public void deleteCustomer(int id);


}
