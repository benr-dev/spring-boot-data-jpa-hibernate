package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

// Example of an entity with a composite key using IdClass annotation

@IdClass(CdId.class)
@Entity
public class Cd {
    @Id
    private String artist;

    @Id
    private String title;

    public Cd() {} // For JPA

    public Cd(String artist, String title) {
        this.artist = artist;
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
