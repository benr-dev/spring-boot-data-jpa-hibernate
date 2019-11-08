package com.example.repository;

import com.example.entity.BluRay;
import com.example.entity.BluRayId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BluRayRepository extends JpaRepository<BluRay, BluRayId> {
}
