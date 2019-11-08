package com.example.repository;

import com.example.entity.Cd;
import com.example.entity.CdId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CdRepository extends JpaRepository<Cd, CdId> {
}
