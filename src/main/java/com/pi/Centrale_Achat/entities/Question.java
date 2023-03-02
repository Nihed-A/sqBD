package com.pi.Centrale_Achat.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Question {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String question;
    private String proposition1;
    private String proposition2;
    private String proposition3;
    private String reponse;

    @ManyToOne
    private EvaluationCustomer evaluationCustomer;
}
