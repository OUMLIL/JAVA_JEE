package com.example.decouverte_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class DecouverteSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DecouverteSpringApplication.class, args);
	}

}
