package com.WebApp.SpringWeb.service;

import com.WebApp.SpringWeb.model.Product;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@Service
public class ProductService {

    private final List<Product> products = new ArrayList<>(Arrays.asList(new Product(101, "iphone", 23000),
            new Product(102, "iphone", 23000),
            new Product(103, "iphone", 23000)));


    public Product getProductById(int prodId) {
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst().orElse(new Product(100, "No item", 0));
    }

    public void addProd(Product prod) {
        products.add(prod);
    }

    public void updateProd(Product prod) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdId() == prod.getProdId()) {
                products.set(i, prod);
                break;
            }
        }
    }

    public Product deleteProd(int prodId) {
        Product productToDelete = null;
        for (Product product : products) {
            if (product.getProdId() == prodId) {
                productToDelete = product;
                break;
            }
        }
        if (productToDelete != null) {
            products.remove(productToDelete);
        }
        return productToDelete;

    }
}
