package com.example.NamingServer123;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NamingServer123Application {

	public static void main(String[] args) {
		SpringApplication.run(NamingServer123Application.class, args);
	}

}
