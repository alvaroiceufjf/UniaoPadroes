package org.example;

public class RelatorioPF implements Relatorio {
    @Override
    public String emitir() {
        return "Relatório de Análise de Risco PF";
    }
}