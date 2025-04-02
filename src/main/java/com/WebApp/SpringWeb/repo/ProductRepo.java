package com.WebApp.SpringWeb.repo;

import com.WebApp.SpringWeb.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
    // This interface will automatically provide CRUD operations for the Product entity
    // No need to implement any methods here, Spring Data JPA will handle it
}
