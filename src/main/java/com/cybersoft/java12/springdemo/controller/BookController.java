package com.cybersoft.java12.springdemo.controller;

import java.security.Provider.Service;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybersoft.java12.springdemo.model.Book;
import com.cybersoft.java12.springdemo.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private BookService service;
	
	@Autowired
	private Book book;
	
	public BookController(BookService bookService) {
		service = bookService;
	}
	
	public void setBookService(@Autowired BookService bookService) {
		service = bookService;
	}

	@GetMapping("")
	public Object getBook()
	{
//		String [] books = {"Design Pattern", "Java Recipe","How to build a maintainable off Software"};
//		return Arrays.asList(books);
		return this.book;
	}
	
	@GetMapping("/s")
	public Object getBooks()
	{
		return service.getBooks();
	}
}
