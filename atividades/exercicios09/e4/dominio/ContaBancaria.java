package atividades.exercicios09.e4.dominio;

public abstract class ContaBancaria {
    private int numero;
    private double saldo;

    public ContaBancaria(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
    
    public void depositar(double valor) {
        if(valor>=0){
            this.saldo += valor;
        }
        else{
            System.out.print("Valor fornecido invalido. ");
        }

    }

    public double consultarSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return numero;
    }

    protected void descontarSaldo(double valor) {
        this.saldo -= valor;
    }

    public abstract void cobrarTaxaMensal();
}
