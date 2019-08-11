package com.panshi.helloapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hi")
    public String hello(@RequestParam String name){
        return "hello,"+name;
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
