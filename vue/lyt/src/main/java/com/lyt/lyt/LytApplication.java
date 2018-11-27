package com.lyt.lyt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages ="com.lyt")
public class LytApplication {

    public static void main(String[] args) {
        SpringApplication.run(LytApplication.class, args);
    }
}
