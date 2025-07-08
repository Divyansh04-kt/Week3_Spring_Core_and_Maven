package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
	private BookRepository bookRepository;
	
	// Setter method for BookRepository
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void display() {
        System.out.println("BookService is running and calling BookRepository method");
        bookRepository.methodcalling();
    }
}
