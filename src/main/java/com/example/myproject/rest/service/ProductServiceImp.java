package com.example.myproject.rest.service;

import com.example.myproject.rest.dao.ProductDAO;
import com.example.myproject.rest.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImp implements ProductService {

    private final ProductDAO productDAO;

    @Autowired
    public ProductServiceImp(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @Override
    public List<Product> getAllProducts() {
        return productDAO.getAllProducts();
    }

    @Override
    public void saveProduct(Product product) {
        productDAO.saveProduct(product);
    }

    @Override
    public Product getProduct(int id) {
        return productDAO.getProduct(id);
    }

    @Override
    public void deleteProduct(int id) {
        productDAO.deleteProduct(id);

    }
}
