package com.example.app.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name="tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String description;

    private Date date;

    private Boolean status;

    @ManyToOne (cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="user_id")

    private User user;

//
    @ManyToOne (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
     @JoinColumn(name = "category_id")
    private Category category;


}
