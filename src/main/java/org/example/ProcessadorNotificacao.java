package org.example;

public abstract class ProcessadorNotificacao {
    protected abstract Notificacao criarNotificacao();

    public String notificar(String cliente) {
        Notificacao notificacao = criarNotificacao();
        return notificacao.gerarMensagem(cliente);
    }
}
