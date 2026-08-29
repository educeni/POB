/* Exercício 4: Contagem de Números Pares e Ímpares em um Intervalo (for)
Enunciado: Faça um programa que leia dois valores inteiros que representam os limites de um intervalo fechado [A, B] (onde A <= B). 
O programa deve iterar por todos os números desse intervalo e exibir:
A quantidade de números pares.
A quantidade de números ímpares.
Conceitos: Estrutura de repetição for combinada com decisão condicional (if/else) e operador módulo (%). */

package atividades.exercicios02;

import java.util.Scanner;

public class Intervalo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Forneca o menor numero do intervalo: ");
        int A = sc.nextInt();

        System.out.print("Forneca o outro numero do intervalo: ");
        int B = sc.nextInt();

        int par=0;
        int impar=0;

        for(int i=A; i<=B; i++)
        {
            if(i%2 == 0)
                par++;
            else
                impar++;
        }

        System.out.println("A quantidade de numero impares eh " + impar + " e a quantidade de numeros pares e " + par);

        sc.close();

    }

}