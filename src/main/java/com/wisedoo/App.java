package com.wisedoo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RestController;


@RestController
@MapperScan("com.wisedoo.project.dao")
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        SpringApplication.run(App.class, args);
    }



}
