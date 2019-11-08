package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

// Example of an entity with a composite key using Embedded annotation

@Entity
public class BluRay {

    @Id
    private BluRayId id;

    public BluRay() {} // For JPA

    public BluRay(String title, String productionCompany) {
        id = new BluRayId(title, productionCompany);
    }

    public String getProductionCompany() {
        return id.getProductionCompany();
    }

    public String getTitle() {
        return id.getTitle();
    }
}
