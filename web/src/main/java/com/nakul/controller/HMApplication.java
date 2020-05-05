package com.nakul.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.nakul.*"})
@EntityScan(basePackages = {"com.nakul.*"})
@EnableJpaRepositories(basePackages = {"com.nakul.*"})
public class HMApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(HMApplication.class);
	}

}
