package com.etoak.controller;

import com.etoak.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentController {
    @Autowired
    StudentService studentService;
    public void addStudent(){
        studentService.addStudent();
    }
}
