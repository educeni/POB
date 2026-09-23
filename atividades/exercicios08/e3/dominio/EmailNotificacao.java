package.atividades.exercicios08.e3.dominio;

public class EmailNotificacao extends Notificacao{
    public EmailNotificacao(String destinatario) {
        super(destinatario);
    }

    @Override
    public void enviar(String Mensagem){
        System.out.print("Enviando E-mail para %s: " + destinatario + "%s\n" + mensagem);
    }

}