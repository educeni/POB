package atividades.exercicios09.e3.dominio;

public class Usuario implements Autenticavel{
    private String login;
    private String senha;

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    @Override 
    public boolean autenticar(String senha){
        return this.senha.equals(senha);
    }

    public String getLogin() { return login; }
}
