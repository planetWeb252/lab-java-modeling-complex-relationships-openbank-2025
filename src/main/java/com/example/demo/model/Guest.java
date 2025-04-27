package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Guest {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private StatusGuest status;

    public Guest() {
    }

    public Guest(Long id, String name, StatusGuest status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StatusGuest getStatus() {
        return status;
    }

    public void setStatus(StatusGuest status) {
        this.status = status;
    }
}
