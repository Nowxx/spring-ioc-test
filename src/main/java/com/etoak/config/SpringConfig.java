package com.etoak.config;

import com.etoak.controller.StudentController;
import com.etoak.service.StudentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean("studentService")
    public StudentService studentService(){
        return new StudentService();
    }

    @Bean("studentController")
    public StudentController studentController() {
        return new StudentController();
    }
}
