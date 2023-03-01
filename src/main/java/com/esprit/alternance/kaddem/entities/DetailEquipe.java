package com.esprit.alternance.kaddem.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DetailEquipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDetailEquipe",nullable = false)
    private Long idDetailEquipe;
    private Integer salle;
    private String thematique;

    // @OneToOne(mappedBy ="detailEquipe")
    // @JsonIgnore
    // private Equipe equipe;
  




}
