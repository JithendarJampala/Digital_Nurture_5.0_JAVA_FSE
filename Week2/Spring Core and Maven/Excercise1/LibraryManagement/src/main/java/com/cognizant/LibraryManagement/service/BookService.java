package com.cognizant.LibraryManagement.service;

import com.cognizant.LibraryManagement.repository.BookRepository;

public class BookService {

    private BookRepository repository;

    public void setRepository(BookRepository repository){
        this.repository = repository;
    }

    public void displayService(){
        System.out.println("Book Service Bean Created");
        repository.displayRepository();
    }
}
