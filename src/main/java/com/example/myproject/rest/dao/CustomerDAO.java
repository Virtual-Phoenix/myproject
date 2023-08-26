package com.example.myproject.rest.dao;

import com.example.myproject.rest.entity.Customer;

import java.util.List;

public interface CustomerDAO {
    public List<Customer> getAllCustomers();

    public void saveCustomer(Customer customer);

    public Customer getCustomer(int id);

    public void deleteCustomer(int id);
}
