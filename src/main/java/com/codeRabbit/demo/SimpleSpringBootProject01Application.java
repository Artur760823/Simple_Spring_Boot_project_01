package com.codeRabbit.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class SimpleSpringBootProject01Application {

	public static void main(String[] args) {

		SpringApplication.run(SimpleSpringBootProject01Application.class, args);
	}

	@GetMapping
	public List<String> hello(){
		return List.of("Hello",  "Wolrd");
	}

}
