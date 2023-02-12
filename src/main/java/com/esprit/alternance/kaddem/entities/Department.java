package com.esprit.alternance.kaddem.entities;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Department implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDepart",nullable = false)
    private long idDepart;
    private String nomDepart;

<<<<<<< HEAD
    @OneToMany(mappedBy = "department")
    private Etudiant etudiant;

    @ManyToOne
    private Universite universite;
=======
    //one to many with Etudiant
    @OneToMany(mappedBy = "Etudiant")
    private List<Etudiant> etudiants;

    //Many to one with Universite
    @ManyToOne
    @JoinColumn(name = "idUniversite")
    private Universite universite;
    
>>>>>>> c8bf912315c71deb6fa90257e25b713f4fc3ccc5

}
