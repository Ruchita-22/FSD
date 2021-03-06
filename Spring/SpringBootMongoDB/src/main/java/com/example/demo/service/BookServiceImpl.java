package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.BookAlreadyExistsException;
import com.example.demo.exception.BookNotFoundException;
import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookRepository bp;
	
	@Override
	public Book saveBook(Book b) 
			throws BookAlreadyExistsException {
		Optional<Book> o = bp.findById(b.getId());
	if(o.isPresent())
		throw new 
			BookAlreadyExistsException("Book id already exists");
	
	  Book bk = bp.save(b);
		return bk;
	}

	@Override
	public Book getBookById(int id) 
			throws BookNotFoundException {
		Optional<Book> o = bp.findById(id);
		Book b = null;
	if(o.isPresent())
			b = o.get();
	else
		throw new 
			BookNotFoundException("id does not exists");
	
	  return b;
	}

}
