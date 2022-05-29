package com.suzy.SuzyGroceryStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.suzy")
public class SuzyGroceryStoreApplication {



	public static void main(String[] args) {
		SpringApplication.run(SuzyGroceryStoreApplication.class, args);
	}

}
