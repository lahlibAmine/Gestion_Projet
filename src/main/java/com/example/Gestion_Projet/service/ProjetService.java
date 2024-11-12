package com.example.Gestion_Projet.service;

import com.example.Gestion_Projet.repository.ProjetRepository;
import org.springframework.stereotype.Service;

@Service
public class ProjetService {
    private final ProjetRepository projetRepository;
    public ProjetService(ProjetRepository projetRepository){
        this.projetRepository = projetRepository;
    }
    /*
    public void createProjet(){
        projetRepository.save()
    }*/
}
