package org.example;

public class RelatorioAgro implements Relatorio {
    @Override
    public String emitir() {
        return "Relatório de Vistoria de Safra e Penhor";
    }
}