package com.esprit.alternance.kaddem.controllers;

import com.esprit.alternance.kaddem.entities.Universite;
import com.esprit.alternance.kaddem.services.UniversiteServiceImpl;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Universite", description = "Crud universites")
@RestController
public class UniversiteController {

    @Autowired
    private UniversiteServiceImpl universiteService;

    @Operation(description = "Get All Universites")
    @GetMapping("/universites")
    public List<Universite> retrieveAllUniversites() {
        return universiteService.retrieveAllUniversites();
    }

    @Operation(description = "Get Universite")
    @GetMapping("/universites/{id}")
    public Universite retrieveUniversite(@PathVariable("id") Long id) {
        return universiteService.retrieveUniversite(id);
    }

    @Operation(description = " add universite ")
    @PostMapping("/universites/add")
    public Universite addUniversite(@RequestBody Universite u) {
        return universiteService.addUniversite(u);
    }

    @Operation(description = "Update Universite")
    @PutMapping("/universites/update/{id}")
    public Universite updateUniversite(@RequestBody Universite u, @PathVariable("id") Long idUniv) {
        u.setIdUniv(idUniv);
        return universiteService.updateUniversite(u);
    }

    @Operation(description = "Delete Universite")
    @DeleteMapping("/universites/delete/{id}")
    public void deleteUniversite(@PathVariable("id") Long idUniv) {
        System.out.println(idUniv);
        universiteService.deleteUniversite(idUniv);
    }

}
