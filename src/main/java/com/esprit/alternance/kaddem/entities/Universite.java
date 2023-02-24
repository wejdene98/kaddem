package com.esprit.alternance.kaddem.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
@Data

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idUniv",nullable = false)
    private Long idUniv;

    @Column(name = "nomUniv")

    private String nomUniv;

    @OneToMany(mappedBy = "university")
    @JsonIgnore
    private List<Department> departments;

}
