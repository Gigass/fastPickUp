package com.gigass;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@MapperScan(basePackages = "com.gigass.mapper")
public class FastpickupApplication {

    public static void main(String[] args) {
        SpringApplication.run(FastpickupApplication.class, args);
    }

}
