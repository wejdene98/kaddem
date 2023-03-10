package com.esprit.alternance.kaddem.controllers;


import com.esprit.alternance.kaddem.entities.Contrat;
import com.esprit.alternance.kaddem.services.ContratServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Tag(name = "Contrat", description = "Crud contrats")
@RestController
public class ContratController {

    @Autowired
    private ContratServiceImpl contratService;

    @Operation(description = "Get All Contrats")
    @GetMapping(value="/contrats")
    public List<Contrat> getAllContrats() {

        return contratService.retrieveAllContrats();
    }

    @Operation(description = "Get Contrat")
    @GetMapping(value="/contrats/{contratId}")
    public Contrat getContrat(@PathVariable(name="contratId") Long contratId) {
        return contratService.retrieveContrat(contratId);
    }

    @Operation(description = " add contrat ")
    @PostMapping(value="/contrats/add")
    public void saveContrat(@RequestBody Contrat contrat) {
        contratService.addContrat(contrat);
    }

    @Operation(description = "Update Contrat")
    @PutMapping(value="/contrats/update/{contratId}")
    public Contrat updateContrat(@RequestBody Contrat contrat, @PathVariable(name="contratId") Long contratId) {
        contrat.setIdContrat(contratId);
        contrat.setDateDebutContrat(new Date());
        contrat.setDateFinContrat(new Date());
        return contratService.updateContrat(contrat);
    }

    @Operation(description = "Delete Contrat")
    @DeleteMapping(value="/contrats/delete/{contratId}")
    public void deleteContrat(@PathVariable(name="contratId") Long contratId) {
        contratService.deleteContrat(contratId);
    }
    
    
    
    

    


    
}
