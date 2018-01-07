package com.ilkaygunel.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class AppConfig {
	@Bean(name = "dataSource")
    public DriverManagerDataSource dataSource() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/SpringSecurityWithSpringBoot");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("");
        return driverManagerDataSource;
    }	
}
