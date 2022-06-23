package com.principale;

public class Categorie {
    private String designationCategorie;
    private String descriptionCategorie;

    public Categorie(String designationCategorie, String descriptionCategorie) {
        this.designationCategorie = designationCategorie;
        this.descriptionCategorie = descriptionCategorie;
    }

    public String getDesignationCategorie() {
        return designationCategorie;
    }

    public String getDescriptionCategorie() {
        return descriptionCategorie;
    }

    public void setDesignationCategorie(String designationCategorie) {
        this.designationCategorie = designationCategorie;
    }

    public void setDescriptionCategorie(String descriptionCategorie) {
        this.descriptionCategorie = descriptionCategorie;
    }
}
