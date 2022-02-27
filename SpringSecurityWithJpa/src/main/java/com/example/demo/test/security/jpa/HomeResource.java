package com.example.demo.test.security.jpa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
	
	@GetMapping("/")
	public String home()
	{
		return("<h1>This is Welcome Page from HOME Spring Security after validation user id and password</h1>");
	}

	@GetMapping("/user")
	public String user()
	{
		return("<h1>This is Welcome Page from USER Spring Security after validation user id and password</h1>");
	}
	@GetMapping("/admin")
	public String admin()
	{
		return("<h1>This is Welcome Page from ADMIN  Spring Security after validation user id and password</h1>");
	}


}
