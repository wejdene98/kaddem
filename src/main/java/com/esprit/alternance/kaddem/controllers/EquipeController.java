package com.esprit.alternance.kaddem.controllers;

import com.esprit.alternance.kaddem.entities.Equipe;
import com.esprit.alternance.kaddem.services.EquipeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EquipeController {
@Autowired
    private EquipeServiceImpl equipeService;


    @RequestMapping("/hello")
    public String sayHello()
    {
        return "Hello";
    }

   @GetMapping(value= "/equipes")
    public List<Equipe> getAllEquipes() {
        return equipeService.retrieveAllEquipes();
    }

    @GetMapping(value= "/equipes/{equipeId}")
    public Equipe getEquipe(@PathVariable(name = "equipeId") Integer equipeId) {
        return equipeService.retrieveEquipe(equipeId);
    }

    @PostMapping(value= "/equipes")
    public void saveEquipe(@RequestBody Equipe equipe) {
        equipeService.addEquipe(equipe);
    }

    @DeleteMapping(value= "/equipes/{equipeId}")
    public void deleteEquipe(@PathVariable(name = "equipeId") Integer equipeId) {
        equipeService.deleteEquipe(equipeId);
    }
    
}
