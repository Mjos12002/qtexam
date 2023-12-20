package com.qt.examapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class UserController {

    @GetMapping("/user")
    public String getAllUser(){
        return "welcome here in rwanda";
    }
    
}
