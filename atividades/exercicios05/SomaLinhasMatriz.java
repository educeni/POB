/* Exercício 4: Soma por Linhas
Enunciado: Faça um programa que leia uma matriz 4 x 3 de números inteiros. Em seguida, calcule a soma dos elementos de cada linha individualmente 
e armazene os resultados em um vetor unidimensional de tamanho 4. Ao final, exiba a soma correspondente a cada linha.
Conceitos: Integração entre arrays bidimensionais e unidimensionais, reinicialização de acumuladores dentro do laço externo. */

package atividades.exercicios05;

import java.util.Scanner;

public class SomaLinhasMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mat[][] = new int[4][3];

        for(int i=0; i<4;i++)
        {
            for(int j=0; j<3;j++)
            {
                System.out.print("Forneca um valor inteiro para a matriz[" + i + "]" + "[" + j + "] ");
                mat[i][j] = sc.nextInt();
            }
        }

        int vet[] = new int[4];
        int soma=0;


        for(int i=0; i<vet.length;i++)
        {   
            soma=0;
            for(int j=0; j<3;j++)
            {
                soma+=mat[i][j];
                
            }
            vet[i] = soma;
            System.out.println("A soma dos valores da linha " + i + " da matriz é: " + soma);
        }         
        sc.close();
    }

}