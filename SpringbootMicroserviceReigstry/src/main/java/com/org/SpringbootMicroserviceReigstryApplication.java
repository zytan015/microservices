package com.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringbootMicroserviceReigstryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMicroserviceReigstryApplication.class, args);
	}

}
