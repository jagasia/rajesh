package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@SpringBootApplication
//use appropriate annotation to scan all the packages
@ComponentScan("com")
@EnableAutoConfiguration
public class ShoppingApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(ShoppingApplication.class, args);
		
	}

}
