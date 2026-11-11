package atividades.exercicios08.e3.dominio;


public class SmsNotificacao extends Notificacao{
    public SmsNotificacao(String destinatario) {
        super(destinatario);
    }

    @Override
    public void enviar(String mensagem){
        System.out.print("Enviando SMS para o numero %s: " + destinatario + "%s\n" + mensagem);
    }

}