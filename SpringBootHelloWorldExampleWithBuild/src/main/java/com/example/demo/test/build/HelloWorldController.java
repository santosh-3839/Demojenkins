package com.example.demo.test.build;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {


	@RequestMapping("/hello")
	public String sayHello()
	{
		return "home";
	}


}
