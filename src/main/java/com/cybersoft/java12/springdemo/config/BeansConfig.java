package com.cybersoft.java12.springdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cybersoft.java12.springdemo.model.Book;

@Configuration
public class BeansConfig {
	@Bean
	public Book getBook()
	{
		return new Book("Spring Boot Up & Run", "J.K");
	}
}
