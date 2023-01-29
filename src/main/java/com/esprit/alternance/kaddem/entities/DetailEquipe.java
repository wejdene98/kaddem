package com.esprit.alternance.kaddem.entities;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
public class DetailEquipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDetailEquipe",nullable = false)
    private long idDetailEquipe;
    private Integer salle;
    private String thematique;


}
