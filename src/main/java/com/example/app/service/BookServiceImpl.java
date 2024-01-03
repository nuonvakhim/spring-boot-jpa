package com.example.app.service;


import com.example.app.entity.Book;
import com.example.app.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class BookServiceImpl implements BookService{

    private final BookRepository repository;
    @Override
    public List<Book> findAll(){
        return (List<Book>) repository.findAll();
    }
    @Override
    public void deleteBookByStatus(Boolean status) {
        repository.deleteBookByStatus(status);

    }
}
