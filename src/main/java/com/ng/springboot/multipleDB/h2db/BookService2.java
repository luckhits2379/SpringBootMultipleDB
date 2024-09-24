package com.ng.springboot.multipleDB.h2db;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Setter;

@Service
@Setter
public class BookService2 {

	@Autowired
	BookRepository2 bookRepository;

	public List<Book2> getAllBooks() {

		return bookRepository.findAll();
	}

	public Optional<Book2> getBookById(int bookId) {

		return bookRepository.findById(bookId);
	}

	public Book2 createBook(Book2 book) {

		return bookRepository.save(book);
	}

	public Book2 updateBook(Book2 book) {

		return bookRepository.save(book);
	}

	public void deleteBook(int bookId) {

		bookRepository.deleteById(bookId);
	}
}
