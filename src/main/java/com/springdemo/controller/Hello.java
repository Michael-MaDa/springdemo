package com.springdemo.controller;

import com.springdemo.model.Person;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "/path/{sn}")
    public String test(@PathVariable String sn) {
        return sn;
    }

    @RequestMapping(value = "/param/req")
    public String reParam(String name, Integer age) {
        return name + age;
    }

    @RequestMapping(value = "/param/model")
    public String modelParam(Person person) {
        return person.toString();
    }

    @RequestMapping(value = "/param/json")
    public String josnParam(@RequestBody Person person) {
        return person.toString();
    }

}
