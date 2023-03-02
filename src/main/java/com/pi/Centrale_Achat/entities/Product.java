package com.pi.Centrale_Achat.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    float price;
    String image;
    int qte;
    String description;
    Integer minStock;
    @JsonIgnore
    @ManyToMany(mappedBy = "products", cascade = {CascadeType.PERSIST})
    List<Order> orders;
    @ManyToOne
    Category category;
    @OneToMany(mappedBy = "product")
    List<MvStock> stocks;
    @JsonIgnore
    @ManyToOne
    User user;
    @ManyToOne
    Tender tender;

}
