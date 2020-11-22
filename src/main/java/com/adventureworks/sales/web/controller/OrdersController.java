package com.adventureworks.sales.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class OrdersController {

    @GetMapping()
    String get(){
        return "Hello World";
    }

}
