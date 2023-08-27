package com.example.myproject.rest.service;

import com.example.myproject.rest.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();

    void saveProduct(Product product);

    Product getProduct(int id);

    void deleteProduct(int id);
}
