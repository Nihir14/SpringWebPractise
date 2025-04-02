package com.WebApp.SpringWeb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.stereotype.Component;


@Setter
@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Component
public class Product {

    @Id
    private int prodId;
    private String prodName;
    private double price;

}
