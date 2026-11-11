package atividades.exercicios09.e3.dominio;

public class Administrador implements Autenticavel, ExportavelJSON {
    private String login;
    private String senha;
    private String nivelAcesso;

    public Administrador(String login, String senha, String nivelAcesso) {
        this.login = login;
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public String getLogin() { return login; }
    public String getSenha() { return senha; }
    public String getNivelAcesso() { return nivelAcesso; }

    @Override 
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }

    @Override 
    public String exportarJSON() {
         return "{\n" +
               "  \"login\": \"" + login + "\",\n" +
               "  \"nivelAcesso\": \"" + nivelAcesso + "\"\n" +
               "}";
    }
}