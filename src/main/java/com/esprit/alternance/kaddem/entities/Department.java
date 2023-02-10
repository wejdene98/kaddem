package com.esprit.alternance.kaddem.entities;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
public class Department implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDepart",nullable = false)
    private long idDepart;
    private String nomDepart;

    //one to many with Etudiant
    @OneToMany(mappedBy = "Etudiant")
    private List<Etudiant> etudiants;

    //Many to one with Universite
    @ManyToOne
    @JoinColumn(name = "idUniversite")
    private Universite universite;
    

}
