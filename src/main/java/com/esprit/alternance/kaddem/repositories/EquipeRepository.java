package com.esprit.alternance.kaddem.repositories;

import java.util.List;

import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;

import com.esprit.alternance.kaddem.entities.Equipe;




public interface EquipeRepository extends JpaRepository<Equipe, Integer> {


public List<projetDetail> findByProjetDetailTechnologie(String technologie);


public List<Projet> findByEquipesNom(String nom);


public List<Projet> findByEquipesNomAndProjetDetailDescriptionIsNotNull(String nom);


public List<Projet> findByEquipesIdEquipeAndEquipesEntrepriseNom(Long idEquipe, String nom );

public List<Projet> findByEquipesSpecialiteAndEquipesEntrepriseAdresse(String specialite, String adresse);



}
