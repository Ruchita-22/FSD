package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.BookAlreadyExistsException;
import com.example.demo.exception.BookNotFoundException;
import com.example.demo.model.Book;
import com.example.demo.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {
	@Autowired
	private BookService bs; 
	
	@PostMapping("/saveBook")
	public ResponseEntity<?> saveBook(@RequestBody Book b)
	    throws BookAlreadyExistsException {
		ResponseEntity<?> rs = null;
		try {
			Book bk = bs.saveBook(b);
			if(bk != null)
				rs = ResponseEntity.
					status(HttpStatus.CREATED).build();
			else
		rs = ResponseEntity.
			status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		catch(BookAlreadyExistsException e) {
	rs = ResponseEntity.status(HttpStatus.CONFLICT).build();
		}
		return rs;
	}
	
	@GetMapping("/getBook/{id}")
	public ResponseEntity<?> getBook(@PathVariable("id") int id) 
		throws BookNotFoundException
	{
		ResponseEntity<?> rs = null;
		try {
			Book b = bs.getBookById(id);
			rs = ResponseEntity.status(HttpStatus.OK).body(b);
		}
		catch(BookNotFoundException e) {
			rs = ResponseEntity.status(HttpStatus.CONFLICT).build();
		}
		return rs;
	}
	
}
