package com.example.app.service;

import com.example.app.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();
    void deleteBookByStatus(Boolean status);
}
