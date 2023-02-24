package com.esprit.alternance.kaddem.controllers;

import com.esprit.alternance.kaddem.entities.Etudiant;
import com.esprit.alternance.kaddem.services.EtudiantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EtudiantController {

    @Autowired
    private EtudiantServiceImpl etudiantService;

    @GetMapping("/etudiants")
    public List<Etudiant> getEtudiants() {
        return etudiantService.retrievEtudiants();
    }

    @GetMapping("/etudiants/{id}")
    public Etudiant getEtudiant(Integer id) {
        return etudiantService.retrieveEtudiant(id);
    }

    @PostMapping("/etudiants/add")
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantService.addEtudiant(e);
    }

    @PutMapping("/etudiants/update")
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantService.updateEtudiant(e);
    }

    @DeleteMapping("/etudiants/delete")
    public void deleteEtudiant(Integer id) {
        etudiantService.deleteEtudiant(id);
    }

    





}
