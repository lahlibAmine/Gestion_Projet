package com.example.Gestion_Projet.domain;

import jakarta.persistence.*;

@Entity
public class TaskDependency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "task_id", nullable = false)
    private Task task; // Tâche principale

    @ManyToOne
    @JoinColumn(name = "dependent_task_id", nullable = false)
    private Task dependentTask; // Tâche dépendante

    // Getters et Setters
}