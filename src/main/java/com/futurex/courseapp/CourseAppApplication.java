package com.futurex.courseapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CourseAppApplication {

    public static void main(String[] args) {

        SpringApplication.run(CourseAppApplication.class, args);
    }

}
