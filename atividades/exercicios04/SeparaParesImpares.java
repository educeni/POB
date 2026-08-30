/* Exercício 5: Separação em Vetores de Pares e Ímpares
Enunciado: Crie um programa que leia 10 números inteiros e os armazene em um vetor original. Em seguida, distribua os valores em dois novos vetores: 
um contendo apenas os números pares e outro contendo apenas os ímpares. Ao final, exiba os elementos de cada um dos novos vetores.
Conceitos: Controle de índices independentes para múltiplos vetores, operador módulo (%) e dimensionamento dinâmico ou estático de arrays auxiliares. */

package atividades.exercicios04;

import java.util.Scanner;

public class SeparaParesImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vet[] = new int[10];
        int vetPares[] = new int[10];
        int vetImpares[] = new int[10];
        int i=0;
        int j=0;
        int k=0;

        for(i=0;i<vet.length;i++)
        {
            System.out.print("Forneca um numero inteiro para guardar no vetor: ");
            vet[i] = sc.nextInt();
        }

        for(i=0;i<vet.length;i++)
        {
            if(vet[i]%2==0)
            {
                vetPares[j] = vet[i];
                j++;
            }
            else
            {
                vetImpares[k] = vet[i];
                k++;
            }
        }
        i=0;

        while((i<j)||(i<k))
        {
            if(i<j)
            {   
                System.out.println(vetPares[i]);
            }
            if(i<k)
            {   
                System.out.println(vetImpares[i]);
            }
            i++;
        }
        sc.close();
    }
}