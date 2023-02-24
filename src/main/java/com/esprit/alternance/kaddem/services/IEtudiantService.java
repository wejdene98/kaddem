package com.esprit.alternance.kaddem.services;

import com.esprit.alternance.kaddem.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {

    List<Etudiant> retrievEtudiants();

    Etudiant addEtudiant(Etudiant e);

    Etudiant updateEtudiant(Etudiant e);

    void deleteEtudiant(Integer id);

    Etudiant retrieveEtudiant(Integer id);
    
    
}
