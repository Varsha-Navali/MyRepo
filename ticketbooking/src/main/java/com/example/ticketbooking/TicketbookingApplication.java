package com.example.ticketbooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages="com.example.ticketbooking.repository") 
@EntityScan(basePackages="com.example.ticketbooking.entity")
@ComponentScan(basePackages="com.example.*")
@EnableEurekaClient
public class TicketbookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketbookingApplication.class, args);
	}

}
