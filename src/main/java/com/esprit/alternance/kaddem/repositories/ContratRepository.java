package com.esprit.alternance.kaddem.repositories;

import java.util.List;

import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;

import com.esprit.alternance.kaddem.entities.Contrat;
import com.esprit.alternance.kaddem.entities.Equipe;

public class ContratRepository extends JpaRepository<Contrat, Long> {

    public List<Contrat> findByEquipe(Equipe equipe);

    public List<Contrat> findByEquipeId(Long id);

    public List<Contrat> findByEquipeIdAndEquipeNom(Long id, String nom);

    public List<Contrat> findByEquipeIdAndEquipeNomAndEquipeChef(Long id, String nom, String chef);

}
