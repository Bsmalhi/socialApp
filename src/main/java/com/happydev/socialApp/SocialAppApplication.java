package com.happydev.socialApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan(basePackages = "com.happydev.socialApp.controllers.*")
public class SocialAppApplication {

	public static void main(String[] args) {

	   ApplicationContext context = SpringApplication.run(SocialAppApplication.class, args);

	}
}
