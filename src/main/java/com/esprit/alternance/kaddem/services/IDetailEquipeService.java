package com.esprit.alternance.kaddem.services;

import com.esprit.alternance.kaddem.entities.DetailEquipe;

import java.util.List;

public interface IDetailEquipeService {

List<DetailEquipe> retrieveAllDetailEquipes();

DetailEquipe addDetailEquipe(DetailEquipe d);

DetailEquipe updateDetailEquipe(DetailEquipe d);

DetailEquipe retrieveDetailEquipe(long id);

void deleteDetailEquipe(long id);

    
}
