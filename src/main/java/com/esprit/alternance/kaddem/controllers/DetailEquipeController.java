package com.esprit.alternance.kaddem.controllers;

import com.esprit.alternance.kaddem.entities.DetailEquipe;
import com.esprit.alternance.kaddem.services.DetailEquipeImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DetailEquipeController {

    @Autowired
    private DetailEquipeImpl detailEquipeService;


    @GetMapping("/detailequipes")
    public List<DetailEquipe> getAllDetailEquipes() {
        return detailEquipeService.retrieveAllDetailEquipes();
    }

    @GetMapping("/detailequipes/{id}")
    public DetailEquipe getDetailEquipeById(@PathVariable(value = "id") Long detailEquipeId) {
        return detailEquipeService.retrieveDetailEquipe(detailEquipeId);
    }

    @PostMapping("/detailequipes/add")
    public DetailEquipe createDetailEquipe( @RequestBody DetailEquipe detailEquipe) {
        return detailEquipeService.addDetailEquipe(detailEquipe);
    }

    @DeleteMapping("/detailequipes/{id}")
    public void deleteDetailEquipe(@PathVariable(value = "id") Long detailEquipeId) {
        detailEquipeService.deleteDetailEquipe(detailEquipeId);
    }


    
}
