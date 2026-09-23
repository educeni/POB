/* Exercício 5: Contas Bancárias com Sobrescrita de Regra de Saque (super)
Enunciado: Crie uma classe Conta com atributos encapsulados numero (String) e saldo (double), com métodos depositar(double valor) e sacar(double valor). Em seguida:
Crie a subclasse ContaPoupanca com o atributo taxaRendimento (double) e método aplicarRendimento(). O método sacar() funciona normalmente sem taxas.
Crie a subclasse ContaCorrente com o atributo limiteChequeEspecial (double). Sobrescreva o método sacar(double valor) para cobrar uma taxa fixa de R$ 2.00 
por saque e permitir que o saldo fique negativo até o limite do cheque especial.
Conceitos: Reutilização de métodos da superclasse, sobrescrita com alteração de regras de validação/taxação e uso de super.sacar().*/

package atividades.exercicios08.e5.dominio;

public class Conta{
    private String numero;
    private double saldo;

    //Construtor
    public Conta(String numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    
    //Getters
    public String getNumero(){
        return numero;
    }

    public double getSaldo(){
        return saldo;
    }

    public void depositar(double valor){
        if (valor <= 0) {
           System.out.print("Valor invalido... \n");
        }
        else{
            this.saldo += valor;
        }
    }

    public void sacar(double valor){
        if (valor <= 0) {
            System.out.print("Valor de saque invalido.");
        }
        else if (valor > saldo) {
            System.out.print("Valor de saque insuficiente.");
        }
        else{
            this.saldo -= valor;
        }
    }

    protected void creditar(double valor) {
        this.saldo += valor;
    }

    protected void debitar(double valor) {
        this.saldo -= valor;
    }

}