package org.example;

public class GerenteNegocio {

    private FabricaAbstrata fabricaDocumentos;
    private ProcessadorNotificacao processadorNotificacao;

    public GerenteNegocio(FabricaAbstrata fabricaDocumentos, ProcessadorNotificacao processadorNotificacao) {
        this.fabricaDocumentos = fabricaDocumentos;
        this.processadorNotificacao = processadorNotificacao;
    }

    public String realizarAtendimento(String cliente) {
        // Abstract Factory gera a família de documentos (que usa o Singleton Dados internamente)
        Contrato contrato = fabricaDocumentos.createContrato();
        Relatorio relatorio = fabricaDocumentos.createRelatorio();

        // Factory Method cria e dispara a notificação
        String mensagemNotificacao = processadorNotificacao.notificar(cliente);

        return contrato.emitir() + " | " + relatorio.emitir() + " | " + mensagemNotificacao;
    }
}