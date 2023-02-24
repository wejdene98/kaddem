package com.esprit.alternance.kaddem.services;


import com.esprit.alternance.kaddem.entities.Etudiant;
import com.esprit.alternance.kaddem.repositories.EtudiantRepository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class EtudiantServiceImpl implements IEtudiantService  {
  
    EtudiantRepository etudiantRepository;

    @Override
    public List<Etudiant> retrievEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public void deleteEtudiant(Integer id) {
        etudiantRepository.deleteById(Long.valueOf(id));
    }

    @Override
    public Etudiant retrieveEtudiant(Integer id) {
        return etudiantRepository.findById(Long.valueOf(id)).get();    }


}
