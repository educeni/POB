/* Exercício 2: Classe ContaBancaria com Proteção de Saldo (Sem Setter para Saldo)
Enunciado: Crie uma classe ContaBancaria com os atributos privados numeroConta (String), titular (String) e
saldo (double). Regras de encapsulamento:
O construtor deve receber obrigatoriamente numeroConta e titular.
O saldo inicial deve começar em zero (ou ter um segundo construtor que aceite um depósito inicial).
O atributo numeroConta deve ter apenas método getter (não pode ser alterado após a criação).
O atributo saldo não deve ter método setter direto — sua alteração só pode ocorrer através dos métodos operacionais depositar(double valor) e sacar(double valor).
O titular pode ter getter e setter.
Conceitos: Encapsulamento estrito
(ocultação de atributos sem expor setters indiscriminadamente) e imutabilidade de campos identificadores.*/

package atividades.exercicios07.e2.dominio;

public class ContaBancaria {
   private String numeroConta;
   private String titular;
   private double saldo;

   // Construtor
   public ContaBancaria(String numeroConta, String titular){
       this.titular = titular;
       this.numeroConta = numeroConta;
       this.saldo = 0;
   }

   // Getters
    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitular(){
        return titular;
    }

    public double getSaldo(){
        return saldo;
    }

   //Setters
    public void setTitular(String titular){
        this.titular = titular;
    }

    //Metodos
    public void depositar(double valor){   
        if(valor>0){
            this.saldo += valor;
        }
    }

    public void sacar(double valor){
        if (valor > 0 && valor <= this.saldo){
            this.saldo -= valor;
        }
    }
}
