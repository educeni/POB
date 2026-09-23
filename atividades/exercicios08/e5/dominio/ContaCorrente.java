package atividades.exercicios08.e5.dominio;

public class ContaCorrente extends Conta {

    private static final double TAXA_SAQUE = 2.00;
    private double limiteChequeEspecial;

    public ContaCorrente(String numero, double saldo, double limiteChequeEspecial) {
        super(numero, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de saque inválido.");
        }

        double total = valor + TAXA_SAQUE;

        if (getSaldo() + limiteChequeEspecial < total) {
            throw new IllegalArgumentException("Limite de cheque especial excedido.");
        }

        if (getSaldo() >= total) {
            // Caminho normal: reutiliza a regra da superclasse
            super.sacar(total);
        } else {
            // Usa o cheque especial
            double saldoAtual = getSaldo();
            if (saldoAtual > 0) {
                super.sacar(saldoAtual);      // zera o saldo usando a regra base
                debitar(total - saldoAtual);  // resto vai para o cheque especial
            } else {
                debitar(total);
            }
        }
    }
}