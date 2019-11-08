package com.example.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

// Alternative approach to composite key using embeddable ID

@Embeddable
public class BluRayId implements Serializable {
    private String productionCompany;
    private String title;

    public BluRayId() {} // For JPA

    public BluRayId(String productionCompany, String title) {
        this.productionCompany = productionCompany;
        this.title = title;
    }

    public String getProductionCompany() {
        return productionCompany;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BluRayId bluRayId = (BluRayId) o;
        return productionCompany.equals(bluRayId.productionCompany) &&
                title.equals(bluRayId.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productionCompany, title);
    }
}
