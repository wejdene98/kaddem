package com.esprit.alternance.kaddem.services;


import com.esprit.alternance.kaddem.entities.DetailEquipe;
import com.esprit.alternance.kaddem.repositories.DetailEquipeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service

public class DetailEquipeImpl implements IDetailEquipeService {

        DetailEquipeRepository detailEquipeRepository;

    @Override
    public List<DetailEquipe> retrieveAllDetailEquipes() {
        return detailEquipeRepository.findAll();
    }

    @Override
    public DetailEquipe addDetailEquipe(DetailEquipe d) {
        return detailEquipeRepository.save(d);
    }

    @Override
    public DetailEquipe updateDetailEquipe(DetailEquipe d) {
        return detailEquipeRepository.save(d);
    }

    @Override
    public DetailEquipe retrieveDetailEquipe(long id) {
        return detailEquipeRepository.findById(id).get();
    }

    @Override
    public void deleteDetailEquipe(long id) {
        detailEquipeRepository.deleteById(id);

    }
}