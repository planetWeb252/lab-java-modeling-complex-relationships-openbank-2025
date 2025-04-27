package com.example.demo.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "chapters")
public class Chapters {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String district;
    private String name;
    @OneToOne
    @JoinColumn(name = "president_id",referencedColumnName = "id")
    private Members president;
    @OneToMany
    private List<Members> members;

    public Chapters() {
    }

    public Chapters(Long id, String district, String name, Members president) {
        this.id = id;
        this.district = district;
        this.name = name;
        this.president = president;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Members getPresident() {
        return president;
    }

    public void setPresident(Members president) {
        this.president = president;
    }
}
