package com.example.helloworld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //Annotation
public class HomeController {

    @GetMapping("/") //Endpoint
    public String index() {
        return "home/index"; //Thymeleaf attributter erstattes med faktisk data
    }
}
