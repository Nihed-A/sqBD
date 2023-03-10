package com.pi.Centrale_Achat.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ResponseClaim implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idResponseClaim;
    String comment;
    Date dateResponse;
    @ManyToOne
    RequestClaim requestClaim;

}
