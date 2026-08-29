/* Exercício 2: Somatório e Média até Flag de Parada (while)
Enunciado: Crie um programa que leia continuamente números inteiros positivos fornecidos pelo usuário. A leitura deve ser encerrada imediatamente quando o usuário 
digitar um número negativo (flag de parada). Ao final, o programa deve exibir a quantidade de números digitados, a soma total e a média aritmética deles 
(desconsiderando o valor negativo).
Conceitos: Laço com condição de parada indeterminada (while), acumulador de valores e contador de iterações. */

package atividades.exercicios02;

import java.util.Scanner;

public class QuantSomaMedia {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int quant=0; 
        double media;
        int soma=0;

        System.out.print("Forneca um numero: ");
            int num = sc.nextInt();

        while(num>=0){
            quant++;
            soma+= num;    
            
            System.out.print("Forneca um numero: ");
            num = sc.nextInt();
        }
        media = (soma/quant);

        System.out.println("Essa e a quantidade de valroes digitados " + quant + " a soma deles eh " + soma + "e a media aritmetica eh " + media);

        sc.close();
    }
}