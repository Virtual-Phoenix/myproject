package com.example.myproject.rest.dao;

import com.example.myproject.rest.entity.Product;
import jakarta.persistence.EntityManager;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDAOImp implements ProductDAO {
    private final EntityManager entityManager;

    public ProductDAOImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public List<Product> getAllProducts() {
        Session session = entityManager.unwrap(Session.class);
        Query query = session.createQuery("from Product ", Product.class);
        List<Product> allProduct = query.getResultList();
        return allProduct;

    }

    @Override
    public void saveProduct(Product product) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(product);

    }

    @Override
    public Product getProduct(int id) {
        Session session = entityManager.unwrap(Session.class);

        Product product = session.get(Product.class, id);
        return product;
    }

    @Override
    public void deleteProduct(int id) {
        Session session = entityManager.unwrap(Session.class);
        Query<Product> query = session.createQuery("delete from Product " +
                "where id=:productId");
        query.setParameter("productId", id);
        query.executeUpdate();

    }
}
