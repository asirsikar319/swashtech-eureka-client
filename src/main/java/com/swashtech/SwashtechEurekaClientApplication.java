package com.swashtech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SwashtechEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwashtechEurekaClientApplication.class, args);
	}

}
