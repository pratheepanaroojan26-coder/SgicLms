package com.SGIC.lms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class test {

    @RequestMapping("/get")
    public String get(){
        return "Alleloya";
    }
}