package com.esprit.alternance.kaddem.repositories;

import com.esprit.alternance.kaddem.entities.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;




public interface EquipeRepository extends JpaRepository<Equipe, Integer> {

/*
public List<projetDetail> findByProjetDetailTechnologie(String technologie);


public List<Projet> findByEquipesNom(String nom);


public List<Projet> findByEquipesNomAndProjetDetailDescriptionIsNotNull(String nom);


public List<Projet> findByEquipesIdEquipeAndEquipesEntrepriseNom(Long idEquipe, String nom );

public List<Projet> findByEquipesSpecialiteAndEquipesEntrepriseAdresse(String specialite, String adresse);*/



}
