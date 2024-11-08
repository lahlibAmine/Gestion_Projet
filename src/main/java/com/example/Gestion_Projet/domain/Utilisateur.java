package com.example.Gestion_Projet.domain;

import com.example.Gestion_Projet.Enum.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Utilisateur  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    private Role role; // Exemple : ADMIN, USER

    @OneToMany(mappedBy = "user")
    private List<Projet> projects; // Projets créés par l'utilisateur

    @OneToMany(mappedBy = "assignedUser")
    private List<Task> assignedTasks; // Tâches assignées à l'utilisateur

    // Getters et Setters

}
