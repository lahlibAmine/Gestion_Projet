package com.example.Gestion_Projet.domain;

import com.example.Gestion_Projet.Enum.Priority;
import com.example.Gestion_Projet.Enum.Status;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(length = 1000)
    private String description;

    @Enumerated(EnumType.STRING)
    private Priority priority; // Exemple : LOW, MEDIUM, HIGH

    @Enumerated(EnumType.STRING)
    private Status status; // Exemple : TO_DO, IN_PROGRESS, DONE

    @Column
    private LocalDate dueDate; // Date d'échéance

    @ManyToOne
    @JoinColumn(name = "project_id", nullable = false)
    private Projet project;

    @ManyToOne
    @JoinColumn(name = "assigned_user_id")
    private Utilisateur assignedUser; // Utilisateur assigné

    @OneToMany(mappedBy = "task", cascade = CascadeType.ALL)
    private List<TimeEntry> timeEntries; // Entrées de temps associées

    @OneToMany(mappedBy = "task", cascade = CascadeType.ALL)
    private List<TaskDependency> dependencies; // Dépendances de la tâche
}
