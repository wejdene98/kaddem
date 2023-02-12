package com.esprit.alternance.kaddem.entities;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
public class DetailEquipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDetailEquipe",nullable = false)
    private long idDetailEquipe;
    private Integer salle;
    private String thematique;

<<<<<<< HEAD
    @OneToOne(mappedBy ="detailEquipe")
    private Equipe equipe;


=======
    //one to one with Equipe
    @OneToOne
    @JoinColumn(name = "idEquipe")
    private Equipe equipe;
>>>>>>> c8bf912315c71deb6fa90257e25b713f4fc3ccc5

}
