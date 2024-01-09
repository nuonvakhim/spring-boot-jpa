package com.example.app.controller;

import com.example.app.dto.BookRequest;
import com.example.app.entity.Book;
import com.example.app.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @GetMapping

    public List<Book> findAll(){
        return bookService.findAll();
    }

    @PostMapping("/create")
    public ResponseEntity<?>createBook(@RequestBody BookRequest payload){

        return ResponseEntity.ok(bookService.createBook(payload));
    }

}
