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

    @OneToOne(mappedBy = "equipe")
    private DetailEquipe detailEquipe;

}
