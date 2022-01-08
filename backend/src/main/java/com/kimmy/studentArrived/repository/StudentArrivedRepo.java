package com.kimmy.studentArrived.repository;

import com.kimmy.studentArrived.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentArrivedRepo extends JpaRepository<Student, Integer> {
}
