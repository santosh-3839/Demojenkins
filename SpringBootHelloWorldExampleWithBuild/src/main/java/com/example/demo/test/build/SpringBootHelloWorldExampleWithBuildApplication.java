package com.example.demo.test.build;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootHelloWorldExampleWithBuildApplication extends SpringBootServletInitializer  {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloWorldExampleWithBuildApplication.class, args);
		System.out.println("<h1>This is example for War file creations</h1>");

	}

}
