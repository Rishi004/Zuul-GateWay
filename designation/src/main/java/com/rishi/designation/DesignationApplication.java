package com.rishi.designation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DesignationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignationApplication.class, args);
	}

}
