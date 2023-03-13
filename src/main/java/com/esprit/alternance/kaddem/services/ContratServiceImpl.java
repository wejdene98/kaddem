package com.esprit.alternance.kaddem.services;

import com.esprit.alternance.kaddem.entities.Contrat;
import com.esprit.alternance.kaddem.repositories.ContratRepository;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;
@AllArgsConstructor
@Service
public class ContratServiceImpl implements IContratService{

    ContratRepository contratRepository;
    private static final java.util.logging.Logger log = java.util.logging.Logger.getLogger(Log.class.getName());

    @Scheduled(fixedDelay = 20000)
    void retrieveAndUpdateStatusContrat(){
        List<Contrat> contratList;
        contratList = contratRepository.findAll();
        Date limitDate = new Date(System.currentTimeMillis() + 15 * 24 * 60 * 60 * 1000);

        contratList.stream().filter(
                contrat -> {
                    if(limitDate.getTime()-contrat.getDateFinContrat().getTime()>0)
                        return true;
                    return false;
                }
        ).forEach(
                contrat -> log.info("THIS CONTRAT ID: "+contrat.getIdContrat()+" WILL BE EN IN "+contrat.getDateFinContrat())
        );

    }

    @Override
    public List<Contrat> retrieveAllContrats() {
        return contratRepository.findAll();
    }

    @Override
    public Contrat addContrat(Contrat c) {
        return contratRepository.save(c) ;
    }

    @Override
    public Contrat updateContrat(Contrat c) {
        return contratRepository.save(c) ;
    }

    @Override
    public Contrat retrieveContrat(Long idContrat) {
        return contratRepository.findById(idContrat).get();
    }

    @Override
    public void deleteContrat(Long id) {
        contratRepository.deleteById(id);

    }
}
