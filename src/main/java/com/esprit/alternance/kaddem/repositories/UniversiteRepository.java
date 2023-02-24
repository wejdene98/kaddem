package com.esprit.alternance.kaddem.repositories;

import com.esprit.alternance.kaddem.entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversiteRepository  extends JpaRepository<Universite, Long>{
/*

    public List<Universite> findByNom(String nom);

    public List<Universite> findByNomAndDepartment(String nom, String department);
*/


}
