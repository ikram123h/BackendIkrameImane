package com.example.beautyprojectback.repositories;

import com.example.beautyprojectback.entities.Parfum;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParfumRepository extends JpaRepository<Parfum, Long> {

}
