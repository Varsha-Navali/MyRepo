package com.example.trainticketbooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages="com.example.trainticketbooking.repository") 
@EntityScan(basePackages="com.example.trainticketbooking.entity")
@ComponentScan(basePackages="com.example.*")
@EnableFeignClients
@EnableEurekaClient
public class TrainticketbookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainticketbookingApplication.class, args);
	}

}
