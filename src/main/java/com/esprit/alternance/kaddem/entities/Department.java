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
public class Department implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDepart",nullable = false)
    private long idDepart;
    private String nomDepart;
    
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "departement")
    @JsonIgnore
    private Set<Etudiant> etudiants;


}
