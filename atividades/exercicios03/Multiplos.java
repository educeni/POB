/* Exercício 1: Tabuada de um Número (for)
Enunciado: Escreva um programa em Java que solicite um número inteiro ao usuário e exiba a sua tabuada de multiplicação de 1 a 10.
Conceitos: Laço de repetição com contador determinado (for), controle de iteração e concatenação de strings na saída.*/

package atividades.exercicios02;

import java.util.Scanner;


public class Multiplos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Forneca o numero inteiro para saber seus multiplos: ");
        int n = sc.nextInt();
        int multiplo;

        System.out.println("Tabuada do " + n);

        for(int i=1; i<=10;i++)
        {
            multiplo = (n*i);
            System.out.println(n + " vezes " + i + " = " + multiplo);
        }
        sc.close();
    }

}