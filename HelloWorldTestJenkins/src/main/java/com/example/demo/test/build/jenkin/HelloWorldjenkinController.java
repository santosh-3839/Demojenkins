package com.example.demo.test.build.jenkin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldjenkinController {
	
	@RequestMapping("/")
	public String hello()
	{
		return "<h1>This is the first Application for Jenkins</h1>";
	}

}
