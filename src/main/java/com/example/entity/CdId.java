package com.example.entity;

import java.io.Serializable;
import java.util.Objects;

// Altenrative approach to composite key using idclass

public class CdId implements Serializable {
    private String artist;
    private String title;

    public CdId() {} // For JPA

    public CdId(String artist, String title) {
        this.artist = artist;
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CdId cdId = (CdId) o;
        return artist.equals(cdId.artist) &&
                title.equals(cdId.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artist, title);
    }
}
