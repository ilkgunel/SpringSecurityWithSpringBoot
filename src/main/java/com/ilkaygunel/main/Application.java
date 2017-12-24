package com.ilkaygunel.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.ilkaygunel.security" })
@ComponentScan(basePackages = { "com.ilkaygunel.pojo" })
@ComponentScan(basePackages = { "com.ilkaygunel.webservice" })
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}