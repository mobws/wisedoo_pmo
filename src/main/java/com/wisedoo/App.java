package com.wisedoo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication(scanBasePackages = {"com.wisedoo"})
@RestController
@MapperScan("com.wisedoo.bd.dao")
public class App {

    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        SpringApplication.run(App.class, args);
    }



}
