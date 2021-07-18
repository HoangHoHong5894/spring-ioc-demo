package com.cybersoft.java12.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cybersoft.java12.springdemo.model.Author;

@Controller
public class WelcomeController {
	
	@GetMapping("")
	@ResponseBody
	public String welcome()
	{
		return "Welcome to SpringBoot";
	}
	
	@GetMapping("/author")
	@ResponseBody
	public Author author()
	{
		return new Author();
	}
}
