package com.employ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class EmployApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployApplication.class, args);
	}
	@Bean
	public Docket docket() {
		return new Docket(DocumentationType.SWAGGER_2);
	}
}