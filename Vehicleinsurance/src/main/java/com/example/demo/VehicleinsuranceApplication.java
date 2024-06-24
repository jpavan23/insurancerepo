package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableConfigurationProperties
@ComponentScan(basePackages = "com.example")
@EnableJpaRepositories(basePackageClasses = com.example.repo.Registrationrepo.class)
@EntityScan("com.example.*")
public class VehicleinsuranceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehicleinsuranceApplication.class, args);
	}

}
