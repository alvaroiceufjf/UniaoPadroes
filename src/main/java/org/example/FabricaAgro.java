package org.example;

public class FabricaAgro implements FabricaAbstrata {
    @Override
    public Contrato createContrato() {
        return new ContratoAgro();
    }

    @Override
    public Relatorio createRelatorio() {
        return new RelatorioAgro();
    }
}