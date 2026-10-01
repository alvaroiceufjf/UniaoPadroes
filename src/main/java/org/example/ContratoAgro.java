package org.example;

public class ContratoAgro implements Contrato {
    @Override
    public String emitir() {
        return "Cédula de Crédito Rural Agro [Coop: " + Dados.getInstance().getCodCoop() +
                " | PA: " + Dados.getInstance().getNumPA() + "]";
    }
}