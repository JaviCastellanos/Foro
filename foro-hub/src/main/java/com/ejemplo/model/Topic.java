package com.ejemplo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String message;
    @ManyToOne
    private User author;
    private Date createdAt = new Date();

    // Getters y setters
}