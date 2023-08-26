package com.example.myproject.rest.service;

import com.example.myproject.rest.dao.CustomerDAO;
import com.example.myproject.rest.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImp implements CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    @Override
    public List<Customer> getAllCustomer() {
        return customerDAO.getAllCustomers();
    }

    @Override
    public void saveCustomer(Customer customer) {
        customerDAO.saveCustomer(customer);
    }

    @Override
    public Customer getCustomer(int id) {
        return customerDAO.getCustomer(id);
    }

    @Override
    public void deleteCustomer(int id) {
        customerDAO.deleteCustomer(id);
    }
}
