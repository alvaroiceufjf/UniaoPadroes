package org.example;

public class ContratoPF implements Contrato {
    @Override
    public String emitir() {
        return "Contrato PF [Coop: " + Dados.getInstance().getCodCoop() +
                " | PA: " + Dados.getInstance().getNumPA() + "]";
    }
}