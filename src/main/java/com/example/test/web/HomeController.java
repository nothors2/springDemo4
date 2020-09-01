package com.example.test.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author:james
 * day:2020-09-01
 */
@RestController
public class HomeController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }
}
