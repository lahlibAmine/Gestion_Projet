package com.example.Gestion_Projet.dto;

import com.example.Gestion_Projet.Enum.Role;
import com.example.Gestion_Projet.domain.Projet;
import com.example.Gestion_Projet.domain.Task;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UtilisateurDto {

    private Long id;
    private String email;
    private String name;
    @Enumerated(EnumType.STRING)
    private Role role;
    private List<Projet> projects;
    private List<Task> assignedTasks;

}
