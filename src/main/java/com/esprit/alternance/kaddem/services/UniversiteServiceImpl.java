package com.esprit.alternance.kaddem.services;

import com.esprit.alternance.kaddem.entities.Universite;
import com.esprit.alternance.kaddem.repositories.UniversiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@AllArgsConstructor
@Service
public class UniversiteServiceImpl implements IUniversiteService{

    UniversiteRepository universiteRepository;

    @Override
    public List<Universite> retrieveAllUniversites() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite addUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite retrieveUniversite(long id) {
        return universiteRepository.findById(id).get();
    }

    @Override
    public void deleteUniversite(long id) {
        universiteRepository.deleteById(id);

    }
}
