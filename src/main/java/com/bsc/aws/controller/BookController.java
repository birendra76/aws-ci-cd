package com.bsc.aws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bsc.aws.dto.Book;
import com.bsc.aws.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookService bookService;
	
	
	@GetMapping(value="/list",produces=MediaType.APPLICATION_JSON_VALUE)
	// @GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Book> getBooks(){
		return bookService.getAllBooks();
		
	}

	
	
}
