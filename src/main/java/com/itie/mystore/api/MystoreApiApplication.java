package com.itie.mystore.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.itie.mystore.api.v1.mapper")
public class MystoreApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MystoreApiApplication.class, args);
    }

}
