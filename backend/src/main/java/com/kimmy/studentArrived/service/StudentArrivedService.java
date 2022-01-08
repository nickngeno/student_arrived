package com.kimmy.studentArrived.service;

import com.kimmy.studentArrived.model.Student;
import com.kimmy.studentArrived.repository.StudentArrivedRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentArrivedService {

    @Autowired
    private StudentArrivedRepo studentArrivedRepo;

    public Student addStudent( Student student){
       return studentArrivedRepo.save(student);
    }

    public Student getStudent(Integer id) {
        return studentArrivedRepo.findById(id).orElse(null);
    }
}
