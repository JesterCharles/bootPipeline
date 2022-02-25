package com.revature.bootPipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BootPipelineApplication {
	
	private int counter;

	@GetMapping("/test")
	public String testEndpoint() {
		counter++;
		return "Hey from the CI/CD pipeline! He did the thing! This is cool " + counter;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(BootPipelineApplication.class, args);
	}

}
