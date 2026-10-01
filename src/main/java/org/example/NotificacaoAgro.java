package org.example;

public class NotificacaoAgro implements Notificacao {
    @Override
    public String gerarMensagem(String cliente) {
        return "Notificação Agro: Crédito Rural liberado para a propriedade de " + cliente;
    }
}
