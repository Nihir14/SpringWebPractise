package com.WebApp.SpringWeb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String text() {
        return "Welcome to the Spring Boot Projects ..";
    }

    @RequestMapping("/about")
    public String about() {
        return "Welcome to the Spring Boot Projects .. This is about Page";
    }
}
