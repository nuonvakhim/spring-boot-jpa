package com.example.app.service;


import com.example.app.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class BookServiceImpl implements BookService{

    private final BookRepository repository;
    @Override
    public void deleteBookByStatus(Boolean status) {
        repository.deleteBookByStatus(status);

    }
}
