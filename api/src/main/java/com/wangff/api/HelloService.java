package com.wangff.api;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @AccessLimit
    public void test(@AccessLimit int a){
        System.out.println("2222222");
    }
}
