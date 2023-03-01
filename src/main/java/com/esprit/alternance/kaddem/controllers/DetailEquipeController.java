package com.esprit.alternance.kaddem.controllers;

import com.esprit.alternance.kaddem.entities.DetailEquipe;
import com.esprit.alternance.kaddem.services.DetailEquipeImpl;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "DetailEquipe", description = "Crud detailequipes")
@RestController
public class DetailEquipeController {

    @Autowired
    private DetailEquipeImpl detailEquipeService;

    @Operation(description = "Get All DetailEquipes")
    @GetMapping("/detailequipes")
    public List<DetailEquipe> getAllDetailEquipes() {
        return detailEquipeService.retrieveAllDetailEquipes();
    }

    @Operation(description = "Get DetailEquipe")
    @GetMapping("/detailequipes/{id}")
    public DetailEquipe getDetailEquipeById(@PathVariable(value = "id") Long detailEquipeId) {
        return detailEquipeService.retrieveDetailEquipe(detailEquipeId);
    }

    @Operation(description = " add detailequipe ")
    @PostMapping("/detailequipes/add")
    public DetailEquipe createDetailEquipe( @RequestBody DetailEquipe detailEquipe) {
        return detailEquipeService.addDetailEquipe(detailEquipe);
    }

    @Operation(description = "Update DetailEquipe")
    @PutMapping("/detailequipes/update/{idDetailEquipe}")
    public DetailEquipe updateDetailEquipe
            (@PathVariable(name="idDetailEquipe") Long idDetailEquipe, @RequestBody DetailEquipe detailEquipe) {
        return detailEquipeService.updateDetailEquipe( detailEquipe);
    }
    
    @Operation(description = "Delete DetailEquipe")
    @DeleteMapping("/detailequipes/delete/{id}")
    public void deleteDetailEquipe(@PathVariable(value = "id") Long detailEquipeId) {
        detailEquipeService.deleteDetailEquipe(detailEquipeId);
    }


    
}
