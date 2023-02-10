package com.esprit.alternance.kaddem.entities;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table( name = "Etudiant")
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idEtudiant")
    private Integer idEtudiant; // Clé primaire
    private String prenomE;
    private String nomE;
    @Enumerated(EnumType.STRING)
    private Option option;

// Constructeur et accesseurs (getters) et mutateurs (setters)


//one to many with Contrat
@OneToMany(mappedBy = "Contrat")
private List<Contrat> contrats;

//Many to one with Department
@ManyToOne
@JoinColumn(name = "idDepartment")
private Department department;

//ManyToMany with Equipe
@ManyToMany(etch = FetchType.LAZY, cascade = CascadeType.ALL)
@JoinTable(name = "Etudiant_Equipe", joinColumns = {
        @JoinColumn(name = "idEtudiant", nullable = false, updatable = false) },
        inverseJoinColumns = { @JoinColumn(name = "idEquipe",
                nullable = false, updatable = false) })

}



