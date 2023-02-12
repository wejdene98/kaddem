package com.esprit.alternance.kaddem.entities;

import java.io.Serializable;

import javax.persistence.Entity;



import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

<<<<<<< HEAD
    @OneToOne(mappedBy = "equipe")
    private DetailEquipe detailEquipe;

=======
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
    
>>>>>>> c8bf912315c71deb6fa90257e25b713f4fc3ccc5
}
