package com.esprit.alternance.kaddem.entities;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idUniv",nullable = false)
    private long idUniv;
    private String nomUniv;

    //one to many with Department
    @OneToMany(mappedBy = "Department")
    private List<Department> departments;
    

}
