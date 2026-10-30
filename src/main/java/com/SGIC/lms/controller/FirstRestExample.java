package com.SGIC.lms.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@RestController
public class FirstRestExample {
    @GetMapping("/jello")

    public ResponseEntity<Object> getAll(){
        return ResponseEntity.ok("Hello my Dear "+12);

    }


@RequestMapping("/hello-mapping")
public Map<String,Object> callMethod(){
    Map<String,Object> map =new HashMap<>();
    map.put("Message","Hellow");
    map.put("Message","Maami");
    map.put("Message1","Hellow");
    map.put("Message1",23);
    return map;
}
}