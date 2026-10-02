package com.backinto.infraestructure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.backinto"})
public class backintoApplication {
    public static void main(String[] args) {
        SpringApplication.run(backintoApplication.class, args);
    }
}
