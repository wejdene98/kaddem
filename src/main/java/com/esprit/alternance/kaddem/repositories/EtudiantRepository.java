package com.esprit.alternance.kaddem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public class EtudiantRepository  extends JpaRepository<Etudiant, Long> {

    public List<Etudiant> findByDepartement(Departement departement);

    public List<Etudiant> findByEquipeNiveau(Niveau niveau);
}
