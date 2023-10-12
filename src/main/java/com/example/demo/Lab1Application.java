package com.example.demo;

import ch.qos.logback.classic.pattern.DateConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class Lab1Application {

	public static void main(String[] args) {

		System.out.println("Start application");
		System.out.println("Info");
		System.out.println(new Date());

		SpringApplication.run(Lab1Application.class, args);
	}

}
