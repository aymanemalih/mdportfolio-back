package com.example.mdportfolio.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class City implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String Code;
    private String Libelle;
    private String description;
    private Boolean isCapitale;

    @ManyToOne
    private Country country;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getLibelle() {
        return Libelle;
    }

    public void setLibelle(String libelle) {
        Libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getCapitale() {
        return isCapitale;
    }

    public void setCapitale(Boolean capitale) {
        isCapitale = capitale;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
