package com.popsyynn.springstudentmanagementsystem.service;

import com.popsyynn.springstudentmanagementsystem.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    public Student saveStudent(Student student);
    List<Student> getAllStudent();
}
