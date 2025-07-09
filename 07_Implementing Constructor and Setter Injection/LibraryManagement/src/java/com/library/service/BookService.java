package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;
    private String message;

    // Constructor for constructor injection
    public BookService(String message) {
        this.message = message;
    }

    // Setter for setter injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void display() {
        System.out.println("Constructor : " + message);
        bookRepository.showMessage();
    }
}
