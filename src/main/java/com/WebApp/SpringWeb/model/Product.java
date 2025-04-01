package com.WebApp.SpringWeb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Data
@AllArgsConstructor
public class Product {


    private int prodId;
    private String prodName;
    private double price;

}
