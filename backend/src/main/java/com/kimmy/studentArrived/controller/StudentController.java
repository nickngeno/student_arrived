package com.kimmy.studentArrived.controller;

import com.kimmy.studentArrived.model.Student;
import com.kimmy.studentArrived.service.StudentArrivedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/")
public class StudentController {

    @Autowired
    private StudentArrivedService service;

    @GetMapping("/{id}")
    public Student getStudent (@PathVariable Integer id){
        return service.getStudent(id);
    }

    @PostMapping("/add")
    public Student addStudent (@RequestBody Student student){
        return service.addStudent(student);
    }

}
