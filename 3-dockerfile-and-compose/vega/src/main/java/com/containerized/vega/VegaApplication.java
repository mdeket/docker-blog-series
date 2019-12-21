package com.containerized.vega;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableRetry
@SpringBootApplication
@RestController
public class VegaApplication {

	public static void main(String[] args) {
		SpringApplication.run(VegaApplication.class, args);
	}

	@RequestMapping("/")
	public String home() {
		return "Hello from Containerized Vega App";
	}
}
