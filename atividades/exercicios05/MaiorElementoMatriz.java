/* Exercício 3: Maior Elemento e sua Localização (Linha e Coluna)
Enunciado: Escreva um programa que leia uma matriz 3 x 4 de números inteiros. O programa deve identificar o maior valor presente na matriz 
e informar exatamente a linha e a coluna onde ele se encontra.
Conceitos: Rastreamento de múltiplos índices de posição (linhaMaior, colunaMaior) e busca linear bidimensional. */

package atividades.exercicios05;

import java.util.Scanner;

public class MaiorElementoMatriz {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int mat[][] = new int[3][4];
        

        for(int i=0; i<3;i++)
        {
            for(int j=0; j<4;j++)
            {
                System.out.print("Forneca um valor inteiro para a matriz[" + i + "]" + "[" + j + "] ");
                mat[i][j] = sc.nextInt();
            }
        }

        int maior = mat[0][0];
        int lin = 0;
        int coluna = 0;

        for(int i=0; i<3;i++)
        {
            for(int j=0; j<4;j++)
            {
                if(mat[i][j]>maior)
                {
                    lin = i;
                    coluna = j;
                    maior = mat[i][j];
                }
            }
        }

        System.out.print("O maior valor é: " + maior + " e ele está na linha -> " + lin + " e na coluna -> " + coluna);
        
        sc.close();
    }
}