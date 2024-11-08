package com.example.Gestion_Projet.repository;

import com.example.Gestion_Projet.domain.Task;
import com.example.Gestion_Projet.domain.TaskDependency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskDependencyRepository extends JpaRepository<TaskDependency, Long> {
}
