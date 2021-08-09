package com.springdemo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping(value = "/path/{sn}")
    public String test(@PathVariable String sn){
        return sn;
    }

    @RequestMapping(value = "/param/req")
    public String reParam(String name, Integer age){
        return name + age;
    }
}
