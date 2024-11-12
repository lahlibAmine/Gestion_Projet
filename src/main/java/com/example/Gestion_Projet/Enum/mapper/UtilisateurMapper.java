package com.example.Gestion_Projet.Enum.mapper;

import com.example.Gestion_Projet.domain.Utilisateur;
import com.example.Gestion_Projet.dto.UtilisateurDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UtilisateurMapper  extends EntityMapper<UtilisateurDto, Utilisateur> {
    UtilisateurDto toDto(Utilisateur utilisateur);
    Utilisateur toEntity(UtilisateurDto utilisateurDto);

}
