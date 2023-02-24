package com.esprit.alternance.kaddem.repositories;

import com.esprit.alternance.kaddem.entities.DetailEquipe;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DetailEquipeRepository  extends JpaRepository<DetailEquipe, Long> {
/*
    public List<DetailEquipe> findByEquipeId(Long id);

    public List<DetailEquipe> findByEquipeIdAndEquipeNom(Long id, String nom);

    public List<DetailEquipe> findByEquipeIdAndEquipeNomAndEquipeChef(Long id, String nom, String chef);*/


    
}
