package com.igt.pw.igtdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PwIgtDemoApplication {

    @GetMapping("/message")
    public String getMessage(){
        return "Its IGT PW Demo webapp";
    }

    public static void main(String[] args) {
        SpringApplication.run(PwIgtDemoApplication.class, args);
    }

}
