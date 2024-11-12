package com.example.Gestion_Projet.controller;

import com.example.Gestion_Projet.dto.UtilisateurDto;
import com.example.Gestion_Projet.service.UtilisateurService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/utilisateur")
@RequiredArgsConstructor
public class UtilisateurController {
    private final UtilisateurService utilisateurService;
    @PostMapping("/save")
    public void saveUser(@RequestBody UtilisateurDto utilisateurDto){
        utilisateurService.saveUser(utilisateurDto);
    }
}
