/* Exercício 4: O Maior de Três Números
Enunciado: Faça um programa que receba três números inteiros distintos e determine qual deles é o maior.
Conceitos: Comparações compostas com operadores relacionais e lógicos. */

package atividades.exercicios02;

import java.util.Scanner;

public class MaiorNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Forneca o primeiro numero: ");
        int n1 = sc.nextInt();

        System.out.print("Forneca o segundo numero: ");
        int n2 = sc.nextInt();

        System.out.print("Forneca o terceiro numero: ");
        int n3 = sc.nextInt();

        int maior;

        if((n1>=n2)&&(n1>=n3)){
            maior = n1;
           
        }
        else if((n2>n1)&&(n2>n3)) {
            maior = n2;
        }
        else {
            maior = n3;
        }

        System.out.println("O maior numero eh " + maior);

        sc.close();
    }
}