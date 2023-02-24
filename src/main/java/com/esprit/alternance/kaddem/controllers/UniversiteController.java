package com.esprit.alternance.kaddem.controllers;

import com.esprit.alternance.kaddem.entities.Universite;
import com.esprit.alternance.kaddem.services.UniversiteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UniversiteController {

    @Autowired
    private UniversiteServiceImpl universiteService;

    @GetMapping("/universites")
    public List<Universite> retrieveAllUniversites() {
        return universiteService.retrieveAllUniversites();
    }

    @GetMapping("/universites/{id}")
    public Universite retrieveUniversite(long id) {
        return universiteService.retrieveUniversite(id);
    }

    @PostMapping("/universites/add")
    public Universite addUniversite(Universite u) {
        return universiteService.addUniversite(u);
    }

    @DeleteMapping("/universites/delete/{id}")
    public void deleteUniversite(long id) {
        universiteService.deleteUniversite(id);
    }
    





}
