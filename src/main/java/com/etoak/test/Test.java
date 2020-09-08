package com.etoak.test;

import com.etoak.config.SpringConfig;
import com.etoak.controller.StudentController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ioc = new AnnotationConfigApplicationContext(SpringConfig.class);
        StudentController studentController = ioc.getBean(StudentController.class);
        studentController.addStudent();
    }
}
