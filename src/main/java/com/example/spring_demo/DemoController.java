package com.example.spring_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("test")
    public String test(){
        return "Hello, Its me";
    }
}
