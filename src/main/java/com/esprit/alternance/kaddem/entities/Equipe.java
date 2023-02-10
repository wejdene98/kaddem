package com.esprit.alternance.kaddem.entities;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idEquipe",nullable = false)
    private long idEquipe;
    private String nomEquipe;
    private Niveau niveau;

    //ManyToMany with Etudiant
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "Etudiant_Equipe", joinColumns = {
            @JoinColumn(name = "idEquipe", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "idEtudiant",
                    nullable = false, updatable = false) })
    private List<Etudiant> etudiants;

    //one to one DetailEquipe
    @OneToOne(mappedBy = "DetailEquipe")
    private DetailEquipe detailEquipe;
    
}
