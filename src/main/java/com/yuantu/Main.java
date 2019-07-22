package com.yuantu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.yuantu.dao")
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(com.yuantu.Main.class);
    }
}
