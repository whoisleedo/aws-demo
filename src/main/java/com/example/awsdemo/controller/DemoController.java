package com.example.awsdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {
    @Value("${aws.demo.controller.id:this is  a demo,}")
    private String demoId;

    @GetMapping("/hello")
    public String hello(){

        return demoId +"   hello world";

    }
}
