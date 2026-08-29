/* Conceitos: Estrutura de repetição for combinada com decisão condicional (if/else) e operador módulo (%).
Exercício 5: Cálculo do Fatorial de um Número (for ou while)
Enunciado: Crie um programa que receba um número inteiro não negativo N e calcule o seu fatorial N!
Conceitos: Variável acumuladora de produto (inicializada em 1), controle de laço decrescente/crescente e tipo de dado numérico para evitar overflow (long).*/

package atividades.exercicios02;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        System.out.print("Forneca o numero inteiro positivo: ");
        int num = sc.nextInt();
        long step = 1;


        if(num<0) {
            System.out.print("ERRO: numero nao valido");
        }
        else {
            for(int i=num; i>=2; i--) {
                step*=i;
            }
            System.out.println("O fatorial do numero " + num + " = " + step);
        }
        sc.close();
    }
}