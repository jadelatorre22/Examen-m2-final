package com.pluralcamp.demo;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWebApplication {

	public final static String API_URL = "http://localhost8080";
	
	public static void main(String[] args) {
//		SpringApplication app = new SpringApplication(SpringBootWebApplication.class);
//				app.setDefaultProperties(
//						Collections.singletonMap("server.port", "8081"));
//				app.run(args);
		SpringApplication.run(SpringBootWebApplication.class, args);
	}

}
