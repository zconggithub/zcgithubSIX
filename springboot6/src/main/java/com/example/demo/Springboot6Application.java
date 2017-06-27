package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages="com.example.demo.dao")
public class Springboot6Application {

	public static void main(String[] args) {
		SpringApplication.run(Springboot6Application.class, args);
	}
}
