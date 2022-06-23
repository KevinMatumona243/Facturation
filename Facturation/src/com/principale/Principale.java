package com.principale;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Principale {
    public static void main(String[] args) {
        //
        Categorie categorie = new Categorie("Produit frais","produit de perissable");

        Adresse adresse = new Adresse("30 juin","n° 15","Lubumbashi",
                "Industriel","Lubumbashi","congo");
        //
        Date dateExp = new Date(2022,07,01);
        //
        Client client = new Client("001","matumona","kevin",
                adresse);
        //
        Produit<Integer> produit = new Produit<>(1,5,"001","banane",
                500,2,dateExp, categorie);
        //
        List<Ligne> lignes = new ArrayList<>();
        Detail detail = new Detail(1,client,lignes);
        Facture facture = new Facture(1,client);
        BonCommande bonCommande = new BonCommande(1,client);
        Devis devis = new Devis(1,client);



    }
}
