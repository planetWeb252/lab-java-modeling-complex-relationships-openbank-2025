package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Conference extends Event{
    @OneToMany
    private List<Speaker> speakers;

    public Conference() {
    }

    public Conference(LocalDate date, int duration, String location, String title, List<Guest> guests, List<Speaker> speakers) {
        super(date, duration, location, title, guests);
        this.speakers = speakers;
    }

    public List<Speaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
    }
}
