package org.example;

public class NotificacaoPF implements Notificacao {
    @Override
    public String gerarMensagem(String cliente) {
        return "Notificação PF: Empréstimo aprovado para o cooperado " + cliente;
    }
}