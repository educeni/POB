/* Exercício 3: Média da Turma e Alunos Acima da Média
Enunciado: Desenvolva um programa que armazene as notas finais de 8 alunos em um vetor do tipo double. Calcule a média aritmética da turma e, em um segundo laço, 
exiba quais notas ficaram estritamente acima da média calculada.
Conceitos: Múltiplas passagens pelo mesmo vetor, cálculo acumulador e filtragem condicional de elementos. */

package atividades.exercicios04;

import java.text.DecimalFormat;

public class AlunoAcimaMedia {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        double vet[] = {5.6,6.1,8.2,3.0,4.6,3.1,7.2,9.3}; 
        double soma=0.0;


        for(int i=0;i<vet.length;i++)
        {
            soma += vet[i];
        }

        double media = soma/vet.length; 

        for(int i=0;i<vet.length;i++) 
        {
            if(vet[i]>media)
            {
                System.out.println("O aluno: " + i + " Ficou com a nota acima da media -> " + df.format(vet[i]));
            }
        }
    }

}