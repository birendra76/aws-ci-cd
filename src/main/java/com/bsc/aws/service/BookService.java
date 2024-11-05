package com.bsc.aws.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bsc.aws.dto.Book;

import jakarta.annotation.PostConstruct;

@Service
public class BookService {
	private List<Book> bookList = new ArrayList<Book>();

	
	public List<Book> getAllBooks(){
		
		return bookList;
	}
	
	
	@PostConstruct
	public void storeBooks() {
		bookList.add(new Book(101,"Computer science",34.50));
		bookList.add(new Book(102,"Maths",100.50));
		bookList.add(new Book(103,"Social study",20.50));
		bookList.add(new Book(104,"Physics",100.50));
		bookList.add(new Book(104,"Physics2",100.50));
		bookList.add(new Book(104,"Physics3",200.50));
	}
	

}
