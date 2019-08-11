package com.panshi.userapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/login")
    public String hello(@RequestParam String name){
        System.out.println("user");
        return restTemplate.getForObject("http://hello-service/hi?name="+name,String.class);
    }
}
