package com.WebApp.SpringWeb.controller;

import com.WebApp.SpringWeb.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.WebApp.SpringWeb.service.ProductService;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public List<Product> getproducts() {
        return service.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId) {
        return service.getProductById(prodId);
    }

    @PostMapping("/products")
    public void addProd(@RequestBody Product prod) {
        service.addProd(prod);
    }

    @PutMapping("/products")
    public void updateProd(@RequestBody Product prod) {
        service.updateProd(prod);
    }

    @DeleteMapping("/products/{prodId}")
    public Product deleteProd(@PathVariable int prodId) {
        return service.deleteProd(prodId);
    }
}
