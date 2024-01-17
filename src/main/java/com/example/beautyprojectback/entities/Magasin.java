package com.example.beautyprojectback.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Magasin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMagasin;
    private String nameMagasin;


}