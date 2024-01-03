package com.example.app.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;


@Entity(name="e_book")
@Table(name="books")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;
    private String author;
    private String title;
    private Boolean status;
}
