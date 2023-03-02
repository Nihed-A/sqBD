package com.pi.Centrale_Achat.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String nom;
    String prenom;
    String username;
    @Column(nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date dateNaissance;
    String password;
    String email;
    String verificationCode;
    boolean verified=false;
    String address;
    String image;
    @Enumerated(EnumType.STRING)
    Role role;
    @OneToMany(mappedBy = "user",cascade = {CascadeType.PERSIST})
    List<Order>orders;
    @OneToMany(mappedBy = "user",cascade = {CascadeType.PERSIST})
    List<Product>products;
    @OneToMany(mappedBy = "user",cascade = {CascadeType.PERSIST})
    List<Location>locations;
    @OneToMany(mappedBy = "user",cascade = {CascadeType.PERSIST})
    List<Tender>tenders;
    @OneToMany(mappedBy = "user",cascade = {CascadeType.PERSIST})
    List<RequestClaim>requestClaims;
    @OneToOne(mappedBy = "user",cascade = {CascadeType.PERSIST})
    EvaluationCustomer evaluationCustomer;
    @OneToMany(mappedBy = "user",cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    List<OperatorScore>operatorScores;


}
