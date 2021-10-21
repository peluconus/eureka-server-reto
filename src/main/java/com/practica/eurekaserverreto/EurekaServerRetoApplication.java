package com.practica.eurekaserverreto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerRetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerRetoApplication.class, args);
	}

}
