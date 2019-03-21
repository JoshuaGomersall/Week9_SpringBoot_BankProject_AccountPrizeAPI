package com.qa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;

@SpringBootApplication
public class PrizesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrizesApplication.class, args);
	}
}
