package com.rebusole.pigfeet;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.rebusole.pigfeet.mapper")
public class PigfeetApplication {

    public static void main(String[] args) {
        SpringApplication.run(PigfeetApplication.class, args);
    }

}
