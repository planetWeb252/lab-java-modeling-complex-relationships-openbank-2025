package com.example.demo.model;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name = "Association")
public class Associaton {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String disctrict;
    private List<Members> members;

}
