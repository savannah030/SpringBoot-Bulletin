package com.bulletin.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "com.bulletin.rest")
public class BulletinRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(BulletinRestApplication.class, args);
	}


	/*
	@GetMapping
	public String HelloWorld(){
		return "Hello Rest";
	}
	*/
}
