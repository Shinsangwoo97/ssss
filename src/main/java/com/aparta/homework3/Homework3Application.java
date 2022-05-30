package com.aparta.homework3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//@PropertySource(value = { "classpath:application-rds.properties" })
@EnableJpaAuditing
@SpringBootApplication
public class Homework3Application {

	public static void main(String[] args) {
		SpringApplication.run(Homework3Application.class, args);
	}

}
