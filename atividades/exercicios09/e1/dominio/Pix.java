package atividades.exercicios09.e1.dominio;


public class Pix implements MetodoPagamento {
    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    public String getChavePix() {
        return chavePix;
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento pix no valor de R$" + valor +  " realizado com sucesso!! ");

    }

    @Override 
    public String obterDetalhes(){
        return "Chave pix: [" + chavePix + "]";

    }
}