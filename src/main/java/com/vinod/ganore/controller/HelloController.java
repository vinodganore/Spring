package com.vinod.ganore.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {

    @RequestMapping("/hello")
    public String sayHi()
    {
        return "<H1>Hii...Vinodkumar ..<H1>";
    }
}
