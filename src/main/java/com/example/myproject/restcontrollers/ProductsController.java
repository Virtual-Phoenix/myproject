package com.example.myproject.restcontrollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {

// must be algorithm for adding products to the users cart in db

    @GetMapping("shop/{product}")
    public String coffee(String product){
        // if product in db add to cart

        //else throw exception

        return "add"+product;
    }

}
