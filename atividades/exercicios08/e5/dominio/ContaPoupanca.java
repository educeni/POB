package atividades.exercicios08.e5.dominio;

public class ContaPoupanca extends Conta {

    private double taxaRendimento;

    public ContaPoupanca(String numero, double saldo, double taxaRendimento) {
        super(numero, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento() {
        creditar(getSaldo() * taxaRendimento);
    }
}