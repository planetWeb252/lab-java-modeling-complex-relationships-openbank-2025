package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "chapters")
public class Chapters {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String district;
    @OneToOne
    private Members president;

}
