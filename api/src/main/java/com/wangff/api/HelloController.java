package com.wangff.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;


    @AccessLimit
    @GetMapping(value = "/test")
    public String test(@AccessLimit int a) {
        helloService.test(2);
        return "ok";
    }
}
