package com.example.app.service;

import com.example.app.dto.BookRequest;
import com.example.app.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();
    Book createBook(BookRequest payload);
    void deleteBookByStatus(Boolean status);
}
