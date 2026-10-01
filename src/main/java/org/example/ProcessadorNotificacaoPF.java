package org.example;

public class ProcessadorNotificacaoPF extends ProcessadorNotificacao {
    @Override
    protected Notificacao criarNotificacao() {
        return new NotificacaoPF();
    }
}
