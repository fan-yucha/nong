package com.buba.farm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.buba.farm.mapper")
@SpringBootApplication
public class FarmInterfaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FarmInterfaceApplication.class, args);
    }

}
