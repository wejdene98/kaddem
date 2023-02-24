package com.esprit.alternance.kaddem.services;

import com.esprit.alternance.kaddem.entities.Universite;

import java.util.List;

public interface IUniversiteService {

    List<Universite> retrieveAllUniversites();

    Universite addUniversite(Universite u);

    Universite updateUniversite(Universite u);

    Universite retrieveUniversite(long id);

    void deleteUniversite(long id);
    
    
}
