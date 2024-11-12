package com.example.Gestion_Projet.service;

import com.example.Gestion_Projet.Enum.mapper.UtilisateurMapper;
import com.example.Gestion_Projet.domain.Utilisateur;
import com.example.Gestion_Projet.dto.UtilisateurDto;
import com.example.Gestion_Projet.repository.UtilisateurRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@RequiredArgsConstructor
public class UtilisateurService {
    private final UtilisateurRepository utilisateurRepository;
    private final UtilisateurMapper utilisateurMapper;
    public void saveUser( UtilisateurDto utilisateurDto){
        Utilisateur utilisateur = utilisateurMapper.toEntity(utilisateurDto);
        utilisateurRepository.save(utilisateur);
    }
}
