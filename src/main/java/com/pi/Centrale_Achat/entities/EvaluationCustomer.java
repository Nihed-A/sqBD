package com.pi.Centrale_Achat.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EvaluationCustomer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idEvaluationCustomer;
    String nameClient;
    @Enumerated(EnumType.STRING)
    SatisfactoryStatus satisfactoryStatus;
    String description;
    @OneToOne
    User user;
    @OneToMany(mappedBy = "evaluationCustomer", cascade={CascadeType.PERSIST, CascadeType.REMOVE})
    private List<Question> questions;

}
