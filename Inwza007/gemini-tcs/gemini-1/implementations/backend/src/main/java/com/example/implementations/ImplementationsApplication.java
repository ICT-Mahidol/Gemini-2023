package com.example.implementations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.implementations.ocs.OCS;


@SpringBootApplication
@ComponentScan(basePackages = {"com.example.implementations", "com.example.implementations.config"})
public class ImplementationsApplication implements WebMvcConfigurer {
	public static void main(String[] args) {
		Boolean generateOcs = false;
		SpringApplication.run(ImplementationsApplication.class, args);
		OCS ocs = new OCS(generateOcs);
	}

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
				.allowedOrigins("*")
				.allowedMethods("GET", "POST", "PUT", "DELETE")
				.allowedHeaders("*");
	}

}