package com.SGIC.lms.service;

import com.SGIC.lms.entity.student;
import com.SGIC.lms.repository.StudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class studentservice {
    private final StudentRepo repo;

    public student saveStudent(student student){
        return repo.save(student);
    }

    public List<student> getAllStudent(){
        return repo.findAll();
    }

@Value("${app.name}")
    private String appName;
    @Value("${app.version}")
    private String appVersion;

    public String getAppInfo(){
        return "App name: "+appName+"App Version"+ appVersion;
    }

    public  student findbyid(long id){
        return repo.findById(id).orElse(null);

    }
    public  void deletebyid(long id){
        repo.deleteById(id);
    }

}
