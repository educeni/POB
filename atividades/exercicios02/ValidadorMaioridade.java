/*Exercício 2: Validador de Maioridade

Enunciado: Crie um programa que leia o ano de nascimento de uma pessoa e o ano atual. Calcule a idade e exiba se ela já é maior de idade
(18 anos ou mais) ou menor de idade.
Conceitos: Operadores relacionais (>=) e subtração básica combinada com decisão.*/

package atividades.exercicios02;

import java.util.Scanner;

public class ValidadorMaioridade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Forneca o seu ano de nascimento: ");
        int nascimento = sc.nextInt(); 

        System.out.print("Forneca o ano atual: ");
        int ano = sc.nextInt();

        int idade = ano - nascimento;
        if(idade >= 18)
        {
            System.out.println("Voce tem" + "e eh maior de idade")
        }
        else
            System.out.println(" Voce tem " + idade + "anos" + "e eh menor de idade ");

        sc.close();
    }
}