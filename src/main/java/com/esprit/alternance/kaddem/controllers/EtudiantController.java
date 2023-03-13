package com.esprit.alternance.kaddem.controllers;

import com.esprit.alternance.kaddem.entities.Etudiant;
import com.esprit.alternance.kaddem.services.EtudiantServiceImpl;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Etudiant", description = "Crud etudiants")
@RestController
public class EtudiantController {

    @Autowired
     EtudiantServiceImpl etudiantService;

    @Operation(description = "Get All Etudiants")
    @GetMapping("/etudiants")
    public List<Etudiant> getEtudiants() {
        return etudiantService.retrievEtudiants();
    }

    @Operation(description = "Get Etudiant")
    @GetMapping("/etudiants/{id}")
    public Etudiant getEtudiant(Integer id) {
        return etudiantService.retrieveEtudiant(id);
    }

    @Operation(description = " add etudiant ")
    @PostMapping("/etudiants/add")
    public Etudiant addEtudiant( @RequestBody Etudiant e) {
        return etudiantService.addEtudiant(e);
    }

    @Operation(description = "Update Etudiant")
    @PutMapping("/etudiants/update/{idEtudiant}")
    public Etudiant updateEtudiant
            (@PathVariable(name="idEtudiant") Integer idEtudiant, @RequestBody Etudiant e) {
        return etudiantService.updateEtudiant( e);
    }

    @Operation(description = "Delete Etudiant")
    @DeleteMapping("/etudiants/delete/{idEtudiant}")
    public void deleteEtudiant(@PathVariable(name="idEtudiant") Integer idEtudiant) {
        etudiantService.deleteEtudiant(idEtudiant);
    }

    @Operation(description = "Assign Etudiant to Departement")
    @PutMapping("/etudiants/assign/{idEtudiant}/{idDepartement}")
    public void assignEtudiantToDepartement
            (@PathVariable(name="idEtudiant") Integer idEtudiant,
             @PathVariable(name="idDepartement") Integer idDepartement) {
        etudiantService.assignEtudiantToDepartement(idEtudiant, idDepartement);
    }

    @Operation(description = "Assign Etudiant to Equipe")
    @PostMapping("/asgin-etudiant-contrat-equipe/{idContrat}/{idEquipe}")
    public Etudiant addAndAssignEtudiantToEquipeAndContract(
            @RequestBody Etudiant etudiant,
            @PathVariable("idContrat") Integer idContrat,
            @PathVariable("idEquipe")  Integer idEquipe
    ){
        return etudiantService.addAndAssignEtudiantToEquipeAndContract(etudiant, idContrat, idEquipe);
    }









}
