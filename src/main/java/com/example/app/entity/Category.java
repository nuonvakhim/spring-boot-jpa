package com.example.app.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table( name="category")
public class Category {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long category_id;

    private String name;

    private Date date;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}
