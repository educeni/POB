package.atividades.exercicios08.e3.dominio;

public class PushNotificacao extends Notificacao{
    public PushNotificacao(String destinatario) {
        super(destinatario);
    }

    @Override
    public void enviar(String Mensagem){
        System.out.print("Enviando Push Notification para o dispositivo %s: " + destinatario + "%s\n" + mensagem);
    }

}