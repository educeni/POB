/* Exercício 5: Matriz Transposta
Enunciado: Crie um programa que leia uma matriz A de dimensão 2 x 3 de números inteiros. Em seguida, construa e 
exiba a sua matriz transposta A^ de dimensão 3 x 2 (onde o elemento da posição [i][j] em A passa a ocupar a posição [j][i] em A^).
Conceitos: Manipulação e inversão de dimensões (linhas viram colunas), instanciação de matrizes complementares.*/

package atividades.exercicios05;

import java.util.Scanner;

public class MatrizTransposta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matA[][] = new int[2][3];

        for(int i=0; i<2;i++)
        {
            for(int j=0; j<3;j++)
            {
                System.out.print("Forneca um valor inteiro para a matriz[" + i + "]" + "[" + j + "] ");
                matA[i][j] = sc.nextInt();
            }
        }

        int matTransp[][] = new int[3][2];

        for(int i=0; i<2;i++)
        {
            for(int j=0; j<3;j++)
            {
                matTransp[j][i] = matA[i][j]; 
            }
        }

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 2; j++) { 
                System.out.print(matTransp[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }

}
