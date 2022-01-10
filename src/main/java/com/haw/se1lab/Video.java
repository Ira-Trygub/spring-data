package com.haw.se1lab;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Video {
    private String name;
    private String filmLink;
    private String description;

    @Id
    @GeneratedValue
    private Long id;

    public Video() {
    }

    public Video(String name, String filmLink, String description) {
        this.name = name;
        this.filmLink = filmLink;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFilmLink() {
        return filmLink;
    }

    public void setFilmLink(String filmLink) {
        this.filmLink = filmLink;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
