package atividades.exercicios09.e4.dominio;

public class ContaEmpresarial extends ContaBancaria{
    
    public ContaEmpresarial(int numero, double saldoInicial) {
        super(numero, saldoInicial);
    }

    @Override 
    public void cobrarTaxaMensal() {
        double porcentagemSobreSaldo = consultarSaldo() * 0.005;
        double valorTotal = 30.00 + porcentagemSobreSaldo;

        System.out.print("O cartao [" + getNumero() + "] \nDeve pagar uma taxa de: " + valorTotal);

        descontarSaldo(valorTotal);
    }

}
