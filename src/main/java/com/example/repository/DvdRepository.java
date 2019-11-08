package com.example.repository;

import com.example.entity.Dvd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DvdRepository extends JpaRepository<Dvd, Long> {
    Optional<Dvd> findByTitle(String title);
}
