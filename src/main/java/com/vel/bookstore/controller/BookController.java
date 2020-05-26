package com.vel.bookstore.controller;

import java.util.Arrays;
import java.util.List;

import com.vel.bookstore.entity.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookController {
	
	@RequestMapping(value="/books")
	public List<Book> getBooks()
	{
		List<Book> bookList = Arrays.asList(
				new Book(1, "2 states", "desc of 2 states", 2007, "fiction" ),
				new Book(2, "Hurry Patter", "desc of hp", 2003, "fiction" ),
				new Book(3, "The Air", "desc of air", 2015, "nonfiction" )
				);
		
		return bookList;
		
	}

}
