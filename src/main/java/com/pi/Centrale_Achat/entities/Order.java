package com.pi.Centrale_Achat.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Orders")
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    Date datCmd;
    String code;
    int qte;
    @JsonIgnore
    @ManyToMany()
    List<Product>products;
    @JsonIgnore
    @OneToOne(mappedBy = "order", cascade = {CascadeType.PERSIST} )
    Bill bill;
    @JsonIgnore
    @ManyToOne
    User user;
    @OneToOne(mappedBy = "order", cascade = {CascadeType.PERSIST})
    Delivery delivery;
    @OneToOne(mappedBy = "order", cascade = {CascadeType.PERSIST})
    OrderReturn orderReturn;
    @OneToMany(mappedBy = "order", cascade = {CascadeType.PERSIST})
    List<RequestClaim>requestClaims;

}
