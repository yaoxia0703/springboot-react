package com.springboot.react.web.springboot3react;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages = "com.springboot.react.web.springboot3react.mapper")
@SpringBootApplication
public class Springboot3ReactApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot3ReactApplication.class, args);
    }

}
