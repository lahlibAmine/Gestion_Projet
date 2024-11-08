package com.example.Gestion_Projet.repository;

import com.example.Gestion_Projet.domain.Projet;
import com.example.Gestion_Projet.domain.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RessourceRepository extends JpaRepository<Resource, Long> {
}
