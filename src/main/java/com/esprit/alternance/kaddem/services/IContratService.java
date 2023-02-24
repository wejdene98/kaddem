package com.esprit.alternance.kaddem.services;

import com.esprit.alternance.kaddem.entities.Contrat;

import java.util.List;

public interface IContratService {

    List<Contrat> retrieveAllContrats();

    Contrat addContrat(Contrat c);

    Contrat updateContrat(Contrat c);

    Contrat retrieveContrat(Long idContrat);

    void deleteContrat(Long id);
    
}
