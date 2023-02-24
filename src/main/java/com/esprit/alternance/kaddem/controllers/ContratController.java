package com.esprit.alternance.kaddem.controllers;


import com.esprit.alternance.kaddem.entities.Contrat;
import com.esprit.alternance.kaddem.services.ContratServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class ContratController {

    @Autowired
    private ContratServiceImpl contratService;

    @RequestMapping("/hello2")
    public String sayHello2()
    {
        return "Hello";
    }

    @GetMapping(value="/contrats")
    public List<Contrat> getAllContrats() {

        return contratService.retrieveAllContrats();
    }

    @GetMapping(value="/contrats/{contratId}")
    public Contrat getContrat(@PathVariable(name="contratId") Long contratId) {
        return contratService.retrieveContrat(contratId);
    }

    @PostMapping(value="/contrats/add")
    public void saveContrat(@RequestBody Contrat contrat) {
        contratService.addContrat(contrat);
    }

    @PutMapping(value="/contrats/update/{contratId}")
    public Contrat updateContrat(@RequestBody Contrat contrat, @PathVariable(name="contratId") Long contratId) {
        contrat.setIdContrat(contratId);
        contrat.setDateDebutContrat(new Date());
        contrat.setDateFinContrat(new Date());
        return contratService.updateContrat(contrat);
    }

    @DeleteMapping(value="/contrats/delete/{contratId}")
    public void deleteContrat(@PathVariable(name="contratId") Long contratId) {
        contratService.deleteContrat(contratId);
    }
    
    
    
    

    


    
}
