package com.example.housemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HouseManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(HouseManagementApplication.class, args);
        
    }
}
