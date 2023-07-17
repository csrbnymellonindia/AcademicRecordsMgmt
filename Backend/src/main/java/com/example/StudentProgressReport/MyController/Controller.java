package com.example.StudentProgressReport.MyController;

import com.example.StudentProgressReport.Entity.Student;
import com.example.StudentProgressReport.Model.StudentDetail;
import com.example.StudentProgressReport.MyRepository.Repository;
import com.example.StudentProgressReport.MyService.Service;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class Controller {
    @Autowired
    private Service service;
    @Transactional()
    @PostMapping("/login")
    public ResponseEntity<Object> login(@RequestBody Map<String, Object> requestBody) {
        String studentId = (String) requestBody.get("studentId");
        String  studentPassword = (String) requestBody.get("studentPassword");
        return new ResponseEntity<>(service.function1(studentId,studentPassword),HttpStatus.OK);
    }
    @GetMapping("/login/{studentId}")
    public ResponseEntity<StudentDetail> getData(@PathVariable("studentId") String studentId){
        return new ResponseEntity<>(service.function2(studentId),HttpStatus.OK);

    }
//    @GetMapping("/{term1}/{studentId}")
//    public ResponseEntity<StudentDetail> getData(@PathVariable("studentId") String studentId){
//        return new ResponseEntity<>(service.function2(studentId),HttpStatus.OK);
//
//    }
}

//@RestController
//public class StudentController {
//
//    @Autowired
//    private StudentRepository studentRepository;
//
//    @PostMapping("/login")
//    public ResponseEntity<String> login(@RequestParam("studentId") String studentId,
//                                        @RequestParam("password") String password) {
//        Student student = studentRepository.findByStudentIdAndPassword(studentId, password);
//        if (student != null) {
//            return ResponseEntity.ok("Yes");
//        } else {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
//        }
//    }
//}

