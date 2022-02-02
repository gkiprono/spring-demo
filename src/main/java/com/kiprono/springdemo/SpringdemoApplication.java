package com.kiprono.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringdemoApplication {

	public static void main(String[] args) {
		System.out.println("Started");
		SpringApplication.run(SpringdemoApplication.class, args);
	}

}
