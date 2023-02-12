package com.esprit.alternance.kaddem.entities;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

<<<<<<< HEAD

    @OneToMany(mappedBy = "etudiant")
    private Contrat contrat;

    @ManyToOne
    private  Department department ;

    @ManyToMany(mappedBy = "etudiant")
    private Equipe equipe;


=======
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
>>>>>>> c8bf912315c71deb6fa90257e25b713f4fc3ccc5

}



