package com.principale;

import java.util.Date;

public class Produit <T> extends Ligne{
    private String code;
    private String designation;
    private double prix;
    private T uniteMesure;
    private Date date;
    private Categorie categorie;

    public Produit(int numeroLigne, int quantite, String code, String designation, double prix, T uniteMesure, Date date, Categorie categorie) {
        super(numeroLigne, quantite);
        this.code = code;
        this.designation = designation;
        this.prix = prix;
        this.uniteMesure = uniteMesure;
        this.date = date;
        this.categorie = categorie;
    }

    public String getCode() {
        return code;
    }

    public String getDesignation() {
        return designation;
    }

    public double getPrix() {
        return prix;
    }

    public T getUniteMesure() {
        return uniteMesure;
    }

    public Date getDate() {
        return date;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setUniteMesure(T uniteMesure) {
        this.uniteMesure = uniteMesure;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
}
