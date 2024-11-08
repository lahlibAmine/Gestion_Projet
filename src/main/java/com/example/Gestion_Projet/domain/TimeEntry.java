package com.example.Gestion_Projet.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
public class TimeEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime startTime;

    @Column(nullable = false)
    private LocalDateTime endTime;

    @ManyToOne
    @JoinColumn(name = "task_id", nullable = false)
    private Task task; // Tâche sur laquelle le temps est suivi

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Utilisateur user; // Utilisateur qui a enregistré l'entrée de temps

    // Getters et Setters
}