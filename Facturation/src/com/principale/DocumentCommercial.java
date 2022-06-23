package com.principale;

public abstract class DocumentCommercial {
    private long numeroDoc;
    private Client cleint;
    private Detail detail;

    public DocumentCommercial(long numeroDoc, Client cleint) {
        this.numeroDoc = numeroDoc;
        this.cleint = cleint;
    }

    public long getNumeroDoc() {
        return numeroDoc;
    }

    public Client getCleint() {
        return cleint;
    }

    public Detail getDetail() {
        return detail;
    }

    public void setNumeroDoc(long numeroDoc) {
        this.numeroDoc = numeroDoc;
    }

    public void setCleint(Client cleint) {
        this.cleint = cleint;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }
    public double getTotal(){return 0;}
    public double getTva(){return 0;}
}
