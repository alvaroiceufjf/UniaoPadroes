package org.example;

public class Dados {

    private static Dados instance = new Dados();
    private String codCoop = "3001";
    private String numPA = "01";

    private Dados() {}

    public static Dados getInstance() {
        return instance;
    }

    public String getCodCoop() { return codCoop; }
    public void setCodCoop(String codCoop) { this.codCoop = codCoop; }

    public String getNumPA() { return numPA; }
    public void setNumPA(String numPA) { this.numPA = numPA; }
}