package com.example.app;

import com.example.app.entity.Book;
import com.example.app.repository.BookRepository;
import com.example.app.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class TestJpaApplication implements CommandLineRunner {

    private BookRepository repository;
    private BookService bookService;


    @Autowired
    public void setRepository(BookRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    public static void main(String[] args) {
        SpringApplication.run(TestJpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Book book = new Book();
//        book.setTitle("TeamWork");
//        repository.save(book);
//
//        System.out.println(repository.findAll());
//


        //update
//        Book updateBook2  = new Book();
//        updateBook2.setUuid(UUID.fromString("59bcb55e-b6c0-4aea-bc62-5a1c98366d1c"));
//        updateBook2.setTitle("Avenger End Game");
//        repository.save(updateBook2);



//
//        System.out.println(repository.findByTitleContainingIgnoreCase("Hello"));
//        System.out.println(repository.findByTitleStartingWithIgnoreCase(                                              "av"));

//        System.out.println(repository.findById(UUID.fromString("8ffdb7a7-d7b4-4ca1-9f72-866cb3ccf4cb")));
//        repository.deleteById(UUID.fromString("8ffdb7a7-d7b4-4ca1-9f72-866cb3ccf4cb" ));
//        System.out.println(repository.existsById(UUID.fromString("8ffdb7a7-d7b4-4ca1-9f72-866cb3ccf4cb" )));

        List<Book> books = repository.selectBookByAuthorNAme("KSHRD");
        books.forEach(System.out::println);

        Book bookByPk = repository.selectBookByPrimaryKey(UUID.fromString("59bcb55e-b6c0-4aea-bc62-5a1c98366d1c")).get();

        System.out.println(bookByPk);

        bookService.deleteBookByStatus(false);
    }
}
