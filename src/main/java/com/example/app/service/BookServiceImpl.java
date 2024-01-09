package com.example.app.service;


import com.example.app.dto.BookRequest;
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
    public Book createBook(BookRequest payload) {
        Book book=new Book();
        book.setStatus(payload.status());
        book.setTitle(payload.title());
        book.setAuthor(payload.author());
        return repository.save(book);
    }

    @Override
    public void deleteBookByStatus(Boolean status) {
//        repository.deleteBookByStatus(status);

    }
}
