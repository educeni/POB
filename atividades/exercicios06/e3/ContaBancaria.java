/* Exercício 3: Classe ContaBancaria com Parâmetros e Validações Simples
Enunciado: Crie uma classe ContaBancaria com os atributos titular (String), numeroConta (String) e saldo (double, iniciando em zero). Implemente os métodos:
depositar(double valor): adiciona o valor ao saldo se valor > 0.
sacar(double valor): subtrai o valor do saldo apenas se houver saldo suficiente (saldo >= valor) e se valor > 0; caso contrário, 
imprime "Saldo insuficiente ou valor inválido".
consultarSaldo(): imprime o saldo atual.
Instancie uma conta no método principal e teste sequências válidas e inválidas de saques e depósitos.
Conceitos: Métodos com passagem de parâmetros, manipulação e proteção de estado interno com condicionais.*/

package atividades.exercicios06.e3;

import java.util.Scanner;

public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;

    //Construtor
    public ContaBancaria(String titular, String numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0; 
    } 

    //Getter
    public double getSaldo() {
        return saldo;
    }
    
    public String getTitular() {
        return titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    //Setter
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void sacar(double valor){
        if((saldo<valor)||(valor<0)) {
            System.out.println("Saldo insuficiente ou valor inválido");
        }
        else
            saldo = saldo - valor;
    }

    public void consultarSaldo() {
        System.out.printf("%.2f\n", saldo);
    }  

    public void depositar(double valor){
        if(valor>0) {
            saldo += valor;
        }
    }
}