package com.comp.rest;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableJpaRepositories("com.comp.**persistence**")
@EntityScan(basePackages = {"com.comp.**"})
@ComponentScan(basePackages = {"com.comp.**"})

public class RestApp {

    public static void main(String[] args) {
        SpringApplication.run(RestApp.class);
    }
}
