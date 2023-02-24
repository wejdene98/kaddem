package com.esprit.alternance.kaddem.controllers;

import com.esprit.alternance.kaddem.entities.Universite;
import com.esprit.alternance.kaddem.services.UniversiteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public Universite retrieveUniversite(@PathVariable("id") Long id) {
        return universiteService.retrieveUniversite(id);
    }

    @PostMapping("/universites/add")
    public Universite addUniversite(@RequestBody Universite u) {
        return universiteService.addUniversite(u);
    }

    @PutMapping("/universites/update/{id}")
    public Universite updateUniversite(@RequestBody Universite u, @PathVariable("id") Long idUniv) {
        u.setIdUniv(idUniv);
        return universiteService.updateUniversite(u);
    }

    @DeleteMapping("/universites/delete/{id}")
    public void deleteUniversite(@PathVariable("id") Long idUniv) {
        System.out.println(idUniv);
        universiteService.deleteUniversite(idUniv);
    }

}
