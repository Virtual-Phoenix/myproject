package com.example.myproject.rest.dao;

import com.example.myproject.rest.entity.Customer;


import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    private EntityManager entityManager;


    @Override
    public List<Customer> getAllCustomers() {
        Session session = entityManager.unwrap(Session.class);

        Query<Customer> query = session.createQuery("from Customer", Customer.class);

        List<Customer> allCustomers = query.getResultList();

        return  allCustomers;

    }

    @Override
    public void saveCustomer(Customer customer) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(customer);
    }

    @Override
    public Customer getCustomer(int id) {
        Session session = entityManager.unwrap(Session.class);

        Customer customer = session.get(Customer.class, id);
        return customer;

    }

    @Override
    public void deleteCustomer(int id) {
        Session session = entityManager.unwrap(Session.class);
        Query<Customer> query = session.createQuery("delete from Customer "+
                "where id =:customerId");
        query.setParameter("customerId", id);
        query.executeUpdate();

    }
}
