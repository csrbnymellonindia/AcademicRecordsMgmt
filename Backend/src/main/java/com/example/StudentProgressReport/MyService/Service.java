package com.example.StudentProgressReport.MyService;

import com.example.StudentProgressReport.Entity.Student;
import com.example.StudentProgressReport.Model.StudentDetail;
import com.example.StudentProgressReport.MyRepository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;
import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    public Repository repository;

    public Object function1(String studentId, String studentPassword) {
        Optional<Student> student = repository.findById(studentId);
        if (Objects.equals(student.get().getStudentPassword(), studentPassword)) {
            return function2(studentId);
        } else {
            StudentDetail studentDetail=StudentDetail.builder()
                    .name(null)
                    .classs(null)
                    .rollNo(null)
                    .build();
            return studentDetail;
        }
    }

    public StudentDetail function2(String studentId) {
        Optional<Student> student = repository.findById(studentId);
        StudentDetail studentDetail=StudentDetail.builder()
                .name(student.get().getName())
                .classs(student.get().getClasss())
                .rollNo(student.get().getRollNo())
                .build();
        return studentDetail;
    }
}

