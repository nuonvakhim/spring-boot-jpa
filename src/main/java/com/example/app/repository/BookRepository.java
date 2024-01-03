package com.example.app.repository;

import com.example.app.entity.Book;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface BookRepository extends CrudRepository<Book , UUID> {


    List<Book> findByTitleStartingWithIgnoreCase(String title);
    List<Book> findByTitleContainingIgnoreCase(String title);
    @Query("SELECT b FROM e_book b  WHERE b.author = ?1")
    List<Book> selectBookByAuthorNAme(String name);

    @Query("SELECT b FROM e_book  b WHERE b.uuid = ?1  ")
    Optional<Book> selectBookByPrimaryKey(UUID primayKey);

    @Modifying
    @Query("DELETE FROM e_book b WHERE b.status =?1")
    void deleteBookByStatus(Boolean status);
 }
