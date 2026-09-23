package atividades.exercicios08.e3.controle;

import atividades.exercicios08.e3.dominio.*;

public class Main {

    public static void processarEnvio(Notificacao notificacao, String texto) {
        notificacao.enviar(texto);
    }

    public static void main(String[] args) {
        Notificacao[] notificacoes = {
            new EmailNotificacao("ana@email.com"),
            new SmsNotificacao("(11) 99999-9999"),
            new PushNotificacao("smartphone-123")
        };

        for (Notificacao n : notificacoes) {
            processarEnvio(n, "Mensagem de teste");
        }
    }
}