package com.example.Gestion_Projet.repository;

import com.example.Gestion_Projet.domain.Projet;
import com.example.Gestion_Projet.domain.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetRepository extends JpaRepository<Projet, Long> {
}
