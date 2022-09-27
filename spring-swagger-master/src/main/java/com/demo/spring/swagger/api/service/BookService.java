package com.demo.spring.swagger.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.spring.swagger.api.dao.BookRepository;
import com.demo.spring.swagger.api.model.Book;

@Service
public class BookService {
	@Autowired
	private BookRepository repository;

	public String saveBook(Book book) {
		repository.save(book);
		return "book save dwith id " + book.getBookId();
	}

	public Optional<Book> getBook(int bookId) {
		return repository.findById(bookId);
	}

	/*
	 * public List<Book> removeBook(int bookId) { repository.delete(bookId); return
	 * repository.findAll(); }
	 */
}
