package com.ng.springboot.multipleDB.mysql;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Setter;

@Service
@Setter
public class BookService1 {

	@Autowired
	BookRepository1 bookRepository;

	public List<Book1> getAllBooks() {

		return bookRepository.findAll();
	}

	public Optional<Book1> getBookById(int bookId) {

		return bookRepository.findById(bookId);
	}

	public Book1 createBook(Book1 book) {

		return bookRepository.save(book);
	}

	public Book1 updateBook(Book1 book) {

		return bookRepository.save(book);
	}

	public void deleteBook(int bookId) {

		bookRepository.deleteById(bookId);
	}
}
