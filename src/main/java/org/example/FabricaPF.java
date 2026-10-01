package org.example;

public class FabricaPF implements FabricaAbstrata {
    @Override
    public Contrato createContrato() {
        return new ContratoPF();
    }

    @Override
    public Relatorio createRelatorio() {
        return new RelatorioPF();
    }
}