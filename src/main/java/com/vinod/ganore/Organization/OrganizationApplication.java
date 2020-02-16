package com.vinod.ganore.Organization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class OrganizationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(OrganizationApplication.class, args);
		System.out.println("Application Context is ..."+ applicationContext);
	}

}
