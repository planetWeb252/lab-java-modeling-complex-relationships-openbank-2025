package com.example.demo.model;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "members")
public class Members {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Enum<Status> status;
    private Date renewalDate;

}
