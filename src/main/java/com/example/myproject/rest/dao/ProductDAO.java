package com.example.myproject.rest.dao;


import com.example.myproject.rest.entity.Product;

import java.util.List;

public interface ProductDAO {
    List<Product> getAllProducts();

    void saveProduct(Product product);

    Product getProduct(int id);

    void deleteProduct(int id);
}
