package com.esprit.alternance.kaddem.services;


import com.esprit.alternance.kaddem.entities.Contrat;
import com.esprit.alternance.kaddem.entities.Department;
import com.esprit.alternance.kaddem.entities.Equipe;
import com.esprit.alternance.kaddem.entities.Etudiant;
import com.esprit.alternance.kaddem.repositories.ContratRepository;
import com.esprit.alternance.kaddem.repositories.DepartmentRepository;
import com.esprit.alternance.kaddem.repositories.EquipeRepository;
import com.esprit.alternance.kaddem.repositories.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@AllArgsConstructor
@Service
public class EtudiantServiceImpl implements IEtudiantService  {
  
    EtudiantRepository etudiantRepository;
    DepartmentRepository departementRepository;
    ContratRepository contratRepository;
    EquipeRepository equipeRepository;

    @Transactional
    public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, long idContrat, long idEquipe) {

        Equipe equipe = equipeRepository.findById(idEquipe).get();
        Contrat contrat = contratRepository.findById(idContrat).get();

        Etudiant etudiant = etudiantRepository.save(e);

        equipe.getEtudiants().add(etudiant);
        equipeRepository.save(equipe);

        contrat.setEtudiant(etudiant);
        contratRepository.save(contrat);
        return e;
    }

    @Override
    public List<Etudiant> retrievEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public void deleteEtudiant(Integer id) {
        etudiantRepository.deleteById(Long.valueOf(id));   }

    @Override
    public Etudiant retrieveEtudiant(Integer id) {
        return etudiantRepository.findById(Long.valueOf(id)).get();    }

    @Override
    public void assignEtudiantToDepartement(Integer etudiantId, Integer departementId) {
        Etudiant etud = etudiantRepository.findById(Long.valueOf(etudiantId)).get();
        Department departement = departementRepository.findById(Long.valueOf(departementId)).get();
        etud.setDepartement(departement);
        etudiantRepository.save(etud);

        


    }


}
