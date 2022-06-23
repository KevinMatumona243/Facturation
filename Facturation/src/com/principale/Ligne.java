package com.principale;

public class Ligne {
    private int numeroLigne;
    private int quantite;
    private Produit produit;

    public Ligne(int numeroLigne, int quantite) {
        this.numeroLigne = numeroLigne;
        this.quantite = quantite;

    }

    public int getNumeroLigne() {
        return numeroLigne;
    }

    public int getQuantite() {
        return quantite;
    }


    public void setNumeroLigne(int numeroLigne) {
        this.numeroLigne = numeroLigne;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }


    public double getPrixTotal(){ return this.produit.getPrix()*getQuantite();}
}
