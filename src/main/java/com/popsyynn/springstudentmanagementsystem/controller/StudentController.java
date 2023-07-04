package com.popsyynn.springstudentmanagementsystem.controller;


import com.popsyynn.springstudentmanagementsystem.model.Student;
import com.popsyynn.springstudentmanagementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student){
        Student student1 = studentService.saveStudent(student);
        return new ResponseEntity<>(student1 , HttpStatus.CREATED);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Student>> getAllStudent(){
        List<Student> students = studentService.getAllStudent();
        return new ResponseEntity<>(students ,HttpStatus.FOUND);
    }

}
