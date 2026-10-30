package com.SGIC.lms.controller;

import com.SGIC.lms.entity.student;
import com.SGIC.lms.service.studentservice;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {
    private final studentservice service;
    @PostMapping
    public student addStudent(@RequestBody student student){
        return service.saveStudent(student);
    }

    @GetMapping
    public List<student> getAllStudent(){
        return service.getAllStudent();
    }


    @GetMapping("/{id}")
    public student findbyid(@PathVariable long id){
        return service.findbyid(id);

    }

    @DeleteMapping("/{id}")
    public String deleteby(@PathVariable long id){
        service.deletebyid(id);
        return  "delete successfully";
    }
}