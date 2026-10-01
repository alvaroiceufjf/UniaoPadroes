package org.example;
public class ProcessadorNotificacaoAgro extends ProcessadorNotificacao {
    @Override
    protected Notificacao criarNotificacao() {
        return new NotificacaoAgro();
    }
}
