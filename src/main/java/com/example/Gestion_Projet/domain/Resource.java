package com.example.Gestion_Projet.domain;

import jakarta.persistence.*;

@Entity
public class Resource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String type; // Exemple : HUMAIN, EQUIPEMENT

    @ManyToOne
    @JoinColumn(name = "project_id", nullable = false)
    private Projet project;

    @Column
    private boolean isAvailable; // Disponibilité de la ressource

    // Getters et Setters

}
