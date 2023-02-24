package com.esprit.alternance.kaddem.repositories;

import com.esprit.alternance.kaddem.entities.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContratRepository extends JpaRepository<Contrat, Long> {

/*public List<Contrat> findByContrat(Contrat contrat);

    public List<Contrat> findByContratId(Long id);

    public List<Contrat> findByContratIdAndContratNom(Long id, String nom);*/


}
