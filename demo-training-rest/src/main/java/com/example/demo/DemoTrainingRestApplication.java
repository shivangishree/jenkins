package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan({"com.boeing.rest", "com.boeing.bean.Customer"})
@SpringBootApplication
public class DemoTrainingRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoTrainingRestApplication.class, args);
	}

}

