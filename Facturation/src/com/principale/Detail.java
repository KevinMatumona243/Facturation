package com.principale;

import java.util.List;

public class Detail extends  DocumentCommercial{
    public List<Ligne> ligne;

    public Detail(long numeroDoc, Client cleint, List<Ligne> ligne) {
        super(numeroDoc, cleint);
        this.ligne = ligne;
    }

    @Override
    public double getTotal() {
        double total = 0;
        for (Ligne ligne:this.getDetail().ligne
             ) {
            total = total + ligne.getPrixTotal();
        }
        return total;
    }

    @Override
    public double getTva() {
        return  getTotal()*0.16;
    }
}
