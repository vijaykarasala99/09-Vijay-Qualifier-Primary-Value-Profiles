package com.vijaystack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		String[] beans = context.getBeanDefinitionNames();
		System.out.println("\n========== ALL SPRING BEANS ==========");

		for (String bean : beans) {
			System.out.println(bean);
		}

		System.out.println("========== TOTAL BEANS: " + beans.length + " ==========\n");
	}

}
