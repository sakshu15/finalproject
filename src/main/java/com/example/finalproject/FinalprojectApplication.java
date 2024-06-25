package com.example.finalproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FinalprojectApplication {
	@GetMapping("/message")
	public String getMessage() {
		return "welcome to session";
		
	}
	@GetMapping("/message1")
	public String getMessage1() {
		return "welcome to session";
		
	}
	public static void main(String[] args) {
		SpringApplication.run(FinalprojectApplication.class, args);
	}

}
