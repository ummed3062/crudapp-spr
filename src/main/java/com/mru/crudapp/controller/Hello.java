package com.mru.crudapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Hello {
    
    @GetMapping("/check")
    String check(){
        return "Check method api....";
    }
}


//http://localhost:8080/api/check