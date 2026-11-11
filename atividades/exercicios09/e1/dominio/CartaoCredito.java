package atividades.exercicios09.e1.dominio;


public class CartaoCredito implements MetodoPagamento {
    private String numeroCartao; 
    private double limite;

    public CartaoCredito(String numeroCartao, double limite) {
        this.numeroCartao = numeroCartao;
        this.limite = limite;

    }

    @Override
    public void processarPagamento(double valor)   {
        if(valor<=limite){
            System.out.println("Pagamento de R$ " + valor + " aprovado no Cartão de Crédito.");
            limite = limite - valor;
        }
        else{
            System.out.println("Pagamento de R$ " + valor + " foi recusado no Cartão de Crédito, limite insuficiente. ");
        }


    }

    @Override 
    public String obterDetalhes() {
        return "Cartão de Crédito - Número: " + numeroCartao + " | Limite disponível: R$ " + limite;
    }
}

