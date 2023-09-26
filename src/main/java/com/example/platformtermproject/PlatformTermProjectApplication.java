package com.example.platformtermproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class PlatformTermProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(PlatformTermProjectApplication.class, args);
	}
}

@RestController
class HelloWorldController {
	@GetMapping("/")
	public String helloWorld() {
		return "Hello, World!";
	}
}
