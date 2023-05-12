package com.project.capastone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class CapastoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapastoneApplication.class, args);
	}

}
