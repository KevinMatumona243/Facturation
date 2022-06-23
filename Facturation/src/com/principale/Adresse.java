package com.principale;

public class Adresse {
    private String avenue;
    private String numero;
    private  String celule;
    private String cartier;
    private String ville;
    private String pays;

    public Adresse(String avenue, String numero, String celule, String cartier, String ville, String pays) {
        this.avenue = avenue;
        this.numero = numero;
        this.celule = celule;
        this.cartier = cartier;
        this.ville = ville;
        this.pays = pays;
    }

    public String getAvenue() {
        return avenue;
    }

    public String getNumero() {
        return numero;
    }

    public String getCelule() {
        return celule;
    }

    public String getCartier() {
        return cartier;
    }

    public String getVille() {
        return ville;
    }

    public String getPays() {
        return pays;
    }

    public void setAvenue(String avenue) {
        this.avenue = avenue;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setCelule(String celule) {
        this.celule = celule;
    }

    public void setCartier(String cartier) {
        this.cartier = cartier;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
}
