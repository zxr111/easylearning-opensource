package com.easylearning.elweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.easylearning.elweb.dao")
public class ElwebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElwebApplication.class, args);
    }
}
