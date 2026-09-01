/*
Exercício 2: Soma dos Elementos da Diagonal Principal
Enunciado: Desenvolva um programa que leia uma matriz quadrada de ordem 4 (4 x 4) de números reais (double). O programa deve calcular
e exibir a soma de todos os elementos que pertencem à diagonal principal (onde o índice da linha é igual ao índice da coluna: i == j).
Conceitos: Matrizes quadradas, identificação geométrica de índices e otimização de iteração (laço único vs laços aninhados).
{{2,3,4,5}, {2.5,6.3,7.4,8.1}, {2.1,3.6,4.3,5.1}, {2.8,9.1,10.0,5.6}}
*/

package atividades.exercicios05;

import java.util.Scanner;
import java.text.DecimalFormat;

public class SomaDiagonal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        double mat[][] = new double[4][4];
        double soma = 0;

        for(int i=0; i<mat.length;i++)
        {
            for(int j=0; j<mat.length;j++)
            {
                System.out.print("Forneca um valor real para a matriz[" + i + "]" + "[" + j + "] ");
                mat[i][j] = sc.nextDouble();
            }
        }

        for(int i=0; i<mat.length;i++)
        {
            for(int j=0; j<mat.length;j++)
            {
                if(i==j)
                {
                    soma += mat[i][j];
                }
            }
        }
        System.out.println("A soma dos valores da diagonal da matriz é: " + df.format(soma));
        sc.close();
    }


}