package com.task.devopstask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
public class DevopsTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevopsTaskApplication.class, args);
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World,New jenkins instance 7.1.0") String name) {
        return String.format("Hello %s!", name);
    }

}