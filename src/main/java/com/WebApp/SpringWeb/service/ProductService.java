package com.WebApp.SpringWeb.service;

import com.WebApp.SpringWeb.model.Product;
import com.WebApp.SpringWeb.repo.ProductRepo;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Getter
@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductById(Long prodId) {
        return repo.getReferenceById(prodId);
    }

    public void addProd(Product prod) {
        repo.save(prod);
    }

    public void updateProd(Product prod) {
        repo.save(prod);
    }

    public Product deleteProd(Long prodId) {
        Product p = repo.getReferenceById(prodId);
        repo.deleteById(prodId);
        return p;
    }
}
