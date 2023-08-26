package com.example.myproject.rest.dao;

import com.example.myproject.rest.entity.Customer;

import java.util.List;

public interface CustomerDAO {
    List<Customer> getAllCustomers();

    void saveCustomer(Customer customer);

    Customer getCustomer(int id);

    void deleteCustomer(int id);
}
