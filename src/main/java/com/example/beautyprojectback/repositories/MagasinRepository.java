package com.example.beautyprojectback.repositories;

import com.example.beautyprojectback.entities.Parfum;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MagasinRepository extends JpaRepository<Parfum, Long> {
}
