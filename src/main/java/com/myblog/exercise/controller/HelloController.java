package com.myblog.exercise.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("hello")
    public String helloTest() {
        return "hello world";
    }
}
