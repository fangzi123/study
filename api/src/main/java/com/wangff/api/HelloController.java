package com.wangff.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;


    @AccessLimit
    @GetMapping(value = "/test")
    public String test(@RequestHeader("appId") Integer appId) {

        return appId+"";
    }
}
