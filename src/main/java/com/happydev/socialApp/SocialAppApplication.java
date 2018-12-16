package com.happydev.socialApp;

import com.happydev.socialApp.config.ymlconfig.YamlConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan(basePackages = "com.happydev.socialApp.*")
public class SocialAppApplication {

	@Autowired
	private static YamlConfig yamlConfig;

	public static void main(String[] args) {

	   ApplicationContext context = SpringApplication.run(SocialAppApplication.class, args);
		System.out.println(yamlConfig.getName());
		System.out.println(yamlConfig.getProfile());
		System.out.println(yamlConfig.getPort());

	}
}
