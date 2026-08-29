/*Exercício 1: Par ou Ímpar

Enunciado: Escreva um programa em Java que leia um número inteiro e informe se ele é par ou ímpar.

Conceitos: Operador módulo (%) e estrutura if-else simples.
 */

package atividades.exercicios02;


import java.util.Scanner;

public class LeituraPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Forneca um valor inteiro: ");
        int num = sc.nextInt();

        if(num%2==0)
        {
            System.out.println("O valor " + num + " é par");
        }
        else {
            System.out.println("O valor " + num + "é impar ");
        }
        sc.close();
    }
}
