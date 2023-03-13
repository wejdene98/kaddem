package com.esprit.alternance.kaddem.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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


    // @OneToMany(mappedBy = "etudiant",cascade = CascadeType.ALL)
    // @JsonIgnore
    // private List<Contrat> contrats;
    // @ManyToOne
    // @JsonIgnore
    // private Department department;
    // @ManyToMany(mappedBy = "etudiants")
    // @JsonIgnore
    // private List<Equipe> equipes ;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "etudiant")
    private Set<Contrat> contrats;
    @ManyToOne
    private Department departement;
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "etudiants")
    private List<Equipe> equipes;


}



