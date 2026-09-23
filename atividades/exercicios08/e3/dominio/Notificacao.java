/* Exercício 3: Sistema de Notificações com Dispatches Heterogêneos
Enunciado: Crie uma classe base Notificacao com o atributo destinatario (String) e um método enviar(String mensagem). Crie três subclasses:
EmailNotificacao: sobrescreve enviar exibindo "Enviando E-mail para [destinatario]: [mensagem]".
SmsNotificacao: sobrescreve enviar exibindo "Enviando SMS para o número [destinatario]: [mensagem]".
PushNotificacao: sobrescreve enviar exibindo "Enviando Push Notification para o dispositivo [destinatario]: [mensagem]".
Crie um método estático processarEnvio(Notificacao notificacao, String texto) que receba qualquer notificação e execute o envio sem saber a implementação concreta.
Conceitos: Polimorfismo aplicado a parâmetros de métodos, desacoplamento e extensão comportamental.*/

package atividades.exercicios08.e3.dominio;

public class Notificacao{
    protected String destinatario;
    
    public Notificacao(String destinatario){
        this.destinatario = destinatario;
    }

    public void enviar(String mensagem){
    }

    public String getDestinatario(){
        return destinatario;
    }

    public static void processarEnvio(Notificacao notificacao, String texto) {
        notificacao.enviar(texto);
    }
}