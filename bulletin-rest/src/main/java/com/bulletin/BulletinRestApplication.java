package com.bulletin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BulletinRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(BulletinRestApplication.class, args);
	}

	@GetMapping
	public String HelloWorld(){
		return "first feature branch";
	}
}
