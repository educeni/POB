/* Exercício 4: Busca Linear de Elemento
Enunciado: Faça um programa que leia um vetor de 6 números inteiros. Em seguida, solicite ao usuário um número de busca ($X$). 
O programa deve informar se $X$ está presente no vetor e, caso esteja, exibir a primeira posição (índice) onde ele foi encontrado. 
Se não estiver presente, exibir uma mensagem indicando ausência.
Conceitos: Algoritmo de busca sequencial, uso de flag booleana (boolean encontrado) e interrupção de repetição com break. */

package atividades.exercicios04;

import java.util.Scanner;

public class AcharNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vet[] = new int[6];
        int i=0;


        while(i<vet.length)
        {
            System.out.print("Forneca um numero: ");
            vet[i] = sc.nextInt();
            i++;
        }

        System.out.print("Forneca o numero de busca: ");
        int num = sc.nextInt();

        boolean encontrado = false;

        for(i=0;i<vet.length;i++) 
        {
            if(num == vet[i])
            {   
                System.out.println("O numero está presente no vetor: " + num + " e esta na posicao -> " + i);
                encontrado = true;
                break;
            }
        }
        
        if(encontrado == false) 
        {
            System.out.println("O numero nao se encontra no vetor. ");
        }
        sc.close();
    }
}