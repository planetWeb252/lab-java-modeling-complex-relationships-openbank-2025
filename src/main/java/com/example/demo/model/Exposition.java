package com.example.demo.model;

import jakarta.persistence.Entity;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Exposition extends Event{
    public Exposition() {
    }

    public Exposition(Long id, LocalDate date, int duration, String location, String title, List<Guest> guests) {
        super(id, date, duration, location, title, guests);
    }
}
