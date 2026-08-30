/* Exercício 1: Armazenamento e Leitura Inversa
Enunciado: Escreva um programa em Java que declare um array de inteiros de tamanho 5, leia os 5 valores informados pelo usuário e, em seguida, 
exiba todos os elementos na ordem inversa à que foram digitados.
Conceitos: Declaração e instanciação de vetores, manipulação de índices e iteração decrescente (i--).
*/

package atividades.exercicios04;

import java.util.Scanner;

public class LeituraInversa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[5];

        for(int i=0; i<vetor.length; i++)
        {
            System.out.print(" Forneca um numero inteiro: ");
            vetor[i] = sc.nextInt();
            
        }

        for(int i= vetor.length -1;i>=0;i--)
        {
            System.out.println(vetor[i]);
        }
        sc.close();
    }
}