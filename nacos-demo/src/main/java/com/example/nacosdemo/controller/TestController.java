package com.example.nacosdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qzz
 */
@RestController
public class TestController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/test")
    public String test(){
        return "test";
    }

    @RequestMapping("/get")
    public String get(){
        return "port:"+port;
    }
}
