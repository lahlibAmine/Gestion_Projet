package com.example.Gestion_Projet.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(length = 1000)
    private String description;

    @Column(nullable = false)
    private LocalDate startDate;

    @Column
    private LocalDate endDate;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Utilisateur user; // Créateur du projet

    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
    private List<Task> tasks; // Liste des tâches associées

    @OneToMany(mappedBy = "project")
    private List<Resource> resources;

}
