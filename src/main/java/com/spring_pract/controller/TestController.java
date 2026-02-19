package com.spring_pract.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/message")
    public String getMessage(){
        return "hi this is uday";
    }
    @GetMapping("/addition")
    public int add(){
        return 10+20;
    }
}
