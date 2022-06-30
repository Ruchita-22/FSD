package com.example.demo.service;

import com.example.demo.exception.BookAlreadyExistsException;
import com.example.demo.exception.BookNotFoundException;
import com.example.demo.model.Book;

public interface BookService {
	public Book saveBook(Book b)
			throws BookAlreadyExistsException;

	public Book getBookById(int id) 
			throws BookNotFoundException;

}
