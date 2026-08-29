/* Exercício 3: Situação do Aluno (Aprovado, Recuperação ou Reprovado)

Enunciado: Desenvolva um programa que leia duas notas de um aluno, calcule a média aritmética e determine a situação acadêmica com base nas seguintes regras:
Média maior ou igual a 7.0: Aprovado
Média entre 5.0 (inclusive) e 6.9: Em Recuperação
Média abaixo de 5.0: Reprovado
Conceitos: Estrutura condicional encadeada (if-else if-else) e operadores lógicos (&&).*/

package atividades.exercicios02;

import java.util.Scanner; 
import java.text.DecimalFormat;

public class SituacaoAluno {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.print("Forneca a primeira nota: ");
        double av1 = sc.nextDouble();

        System.out.print("Forneca a segunda nota: ");
        double av2 = sc.nextDouble();

        double media = (av1+av2) / 2 ;

        if(media>=7) {
            System.out.println("Sua nota eh " + df.format(media) + "e voce esta aprovado ");
        }
        else if(media>=5) {
            System.out.println("Sua nota eh " + df.format(media) + "e voce esta em recuperacao ");
        }
        else
            System.out.println("Sua nota eh " + df.format(media) + "e voce esta reprovado ");

        sc.close();
    }
}