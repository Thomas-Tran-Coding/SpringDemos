package com.springdemo.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.springdemo")
public class txtToJsonApp extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(txtToJsonApp.class, args);
	}

}
