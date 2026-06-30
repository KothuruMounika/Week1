package com.cognizant.springlearn3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:employee.xml")
public class SpringLearn3Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringLearn3Application.class, args);
    }
}