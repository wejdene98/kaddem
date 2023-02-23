package com.esprit.alternance.kaddem.repositories;

import com.esprit.alternance.kaddem.entities.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContratRepository extends JpaRepository<Contrat, Long> {

   /* public List<Contrat> findByEquipe(Equipe equipe);

    public List<Contrat> findByEquipeId(Long id);

    public List<Contrat> findByEquipeIdAndEquipeNom(Long id, String nom);

    public List<Contrat> findByEquipeIdAndEquipeNomAndEquipeChef(Long id, String nom, String chef);*/

}
