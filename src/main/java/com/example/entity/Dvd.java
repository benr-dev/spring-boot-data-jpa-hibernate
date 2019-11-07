package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "dvds")
public class Dvd {

    @Id @GeneratedValue
    private long id;

    private String title;

    @Column(name = "runtime")
    private int runningTimeInSeconds;

    public Dvd() {} // for JPA

    public Dvd(long id, String title, int runningTimeInSeconds) {
        this.id = id;
        this.title = title;
        this.runningTimeInSeconds = runningTimeInSeconds;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRunningTimeInSeconds() {
        return runningTimeInSeconds;
    }

    public void setRunningTimeInSeconds(int runningTimeInSeconds) {
        this.runningTimeInSeconds = runningTimeInSeconds;
    }
}
