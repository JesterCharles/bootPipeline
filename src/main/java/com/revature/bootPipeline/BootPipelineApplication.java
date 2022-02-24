package com.revature.bootPipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BootPipelineApplication {

	@GetMapping("/test")
	public String testEndpoint() {
		return "Hey from the CI/CD pipeline! He did the thing!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(BootPipelineApplication.class, args);
	}

}
