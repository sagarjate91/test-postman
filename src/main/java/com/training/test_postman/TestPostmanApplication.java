package com.training.test_postman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestPostmanApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestPostmanApplication.class, args);
	}

	@GetMapping("/test")
	public String test(){
		return "Postman is working!";
	}

}
