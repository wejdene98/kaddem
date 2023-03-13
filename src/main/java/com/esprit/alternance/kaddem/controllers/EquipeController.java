package com.esprit.alternance.kaddem.controllers;

import com.esprit.alternance.kaddem.entities.Equipe;
import com.esprit.alternance.kaddem.services.EquipeServiceImpl;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Equipe", description = "Crud equipes")
@RestController
public class EquipeController {
@Autowired
     EquipeServiceImpl equipeService;

   @Operation(description = "Get All Equipes")
   @GetMapping(value= "/equipes")
    public List<Equipe> getAllEquipes() {
        return equipeService.retrieveAllEquipes();
    }

    @Operation(description = "Get Equipe")
    @GetMapping(value= "/equipes/{equipeId}")
    public Equipe getEquipe(@PathVariable(name = "equipeId") Integer equipeId) {
        return equipeService.retrieveEquipe(equipeId);
    }
    
    @Operation(description = " add equipe ")
    @PostMapping(value= "/equipes/add")
    public void saveEquipe(@RequestBody Equipe equipe) {
        equipeService.addEquipe(equipe);
    }

    @Operation(description = "Update Equipe")
    @PutMapping(value= "/equipes/update/{equipeId}")
    public Equipe updateEquipe(@PathVariable(name = "equipeId") Integer equipeId, @RequestBody Equipe equipe) {
        return equipeService.updateEquipe(equipe);
    }

    @Operation(description = "Delete Equipe")
    @DeleteMapping(value= "/equipes/delete/{equipeId}")
    public void deleteEquipe(@PathVariable("equipeId") long equipeId) {
        equipeService.deleteEquipe(equipeId);
    }

    
}
