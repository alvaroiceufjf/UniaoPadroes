package org.example;

public class ContratoPF implements Contrato {
    @Override
    public String emitir() {
        return "Contrato de Empréstimo Pessoa Física";
    }
}