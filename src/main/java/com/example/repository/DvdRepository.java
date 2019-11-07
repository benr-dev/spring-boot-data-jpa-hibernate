package com.example.repository;

import com.example.entity.Dvd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DvdRepository extends JpaRepository<Dvd, Long> {
    Dvd findByTitle(String title);
}
