package atividades.exercicios09.e4.dominio;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(int numero, double saldoInicial) {
        super(numero, saldoInicial);
    }


    @Override 
    public void cobrarTaxaMensal(){
        System.out.print("O cartao [" + getNumero() + "] \nDeve pagar uma taxa de: R$15,00");
        descontarSaldo(15.00);
    }


}
