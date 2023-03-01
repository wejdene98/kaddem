package com.esprit.alternance.kaddem.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name="equipe")
public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idEquipe",nullable = false)
    private long idEquipe;
    private String nomEquipe;
    private Niveau niveau;

    // @OneToOne
    // private DetailEquipe detailEquipe;

    // @ManyToMany(cascade =CascadeType.ALL)
    // @JsonIgnore
    // private Set<Etudiant> etudiants;

  
    @OneToOne(cascade = CascadeType.ALL)
    private DetailEquipe detailEquipe;


    @ManyToMany
    @JsonIgnore
    private List<Etudiant> etudiants;


}
