package com.bulletin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BulletinBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(BulletinBatchApplication.class, args);
	}

	@GetMapping
	public String HelloBatch(){
		return "Hello Batch";
	}
}
