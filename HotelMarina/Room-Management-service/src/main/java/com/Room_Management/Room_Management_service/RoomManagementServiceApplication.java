package com.Room_Management.Room_Management_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class RoomManagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoomManagementServiceApplication.class, args);
	}

}
