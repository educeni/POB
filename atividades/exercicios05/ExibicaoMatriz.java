/* Exercício 1: Preenchimento e Exibição de Matriz 3 x 3
Enunciado: Crie um programa em Java que declare e preencha uma matriz de inteiros 3 x 3 com valores fornecidos pelo usuário.
Ao final, exiba a matriz formatada em formato de grade (linhas e colunas).
Conceitos: Declaração e instanciação de arrays bidimensionais (int[][]), laços aninhados (for dentro de for) e formatação de saída (print vs println).*/

package atividades.exercicios05;

import java.util.Scanner;


public class ExibicaoMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mat[][] = new int[3][3]; 

        for(int i=0; i<3;i++)
        {
            for(int j=0; j<3;j++)
            {
                System.out.print("Forneca um valor inteiro para a matriz[" + i + "]" + "[" + j + "] ");
                mat[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<3;i++)
        {
            
            for(int j=0; j<3;i--)
            {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }



        sc.close();
    }


}