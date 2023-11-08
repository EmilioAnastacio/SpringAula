package com.aulaSecurity.demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

    @GetMapping
    @PreAuthorize("hasRole('USER')")
    public String teste(){
        return "<h1> tem role USER </h1>";
    }

    @GetMapping("/teste")
    public String teste1(){
        return "<h1> login funcionou </h1>";
    }

    @GetMapping("/livre")
    public String teste2(){
        return "<h1> livre </h1>";
    }


}
