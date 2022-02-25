package com.revature.bootPipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class BootPipelineApplication {
	
	private int counter;
	
	@GetMapping("/testingCICD")
	public String testingCiCd() {
		counter++;
		return "Hello from the pipelines. You are request number: " + counter;
	}

	public static void main(String[] args) {
		SpringApplication.run(BootPipelineApplication.class, args);
	}
	
	
}
