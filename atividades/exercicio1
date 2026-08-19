/* Exercício 1: Calculadora de Média Simples
Enunciado: Escreva um programa em Java que leia três notas de um aluno (números decimais), calcule e exiba a média aritmética simples dessas notas.
Conceitos: Leitura de dados (Scanner), variáveis do tipo double, operadores aritméticos de soma e divisão.
Exemplo de Entrada: 7.5, 8.0, 6.5 Saída esperada: Média: 7.33
*/

package atividades;

import java.util.Scanner;
import java.text.DecimalFormat;

public class MediaAluno {
    public static void main(String[] args)   {
        Scanner sc = new Scanner(System.in);    
        DecimalFormat df = new DecimalFormat("#,00");

        System.out.print("Forneca o nome do aluno: ");
        String aluno = sc.next();

        System.out.println("Forneca a primeira nota do aluno: ");
        double nota1 = sc.nextDouble();

        System.out.println("Forneca a segunda nota do aluno: ");
        double nota2 = sc.nextDouble();

        System.out.println("Forneca a terceira nota do aluno: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Essa é a média aritmética do aluno: " + aluno + df.format(media));
        sc.close();
    }
}
