package com.example.Gestion_Projet.repository;

import com.example.Gestion_Projet.domain.Projet;
import com.example.Gestion_Projet.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
