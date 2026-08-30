/* Exercício 2: Maior, Menor e suas Posições
Enunciado: Crie um programa que preencha um vetor de 10 números inteiros. O programa deve percorrer o vetor e identificar:
O maior valor e o índice onde ele se encontra.
O menor valor e o índice onde ele se encontra.
Conceitos: Inicialização de variáveis de controle com o primeiro elemento (vetor[0]), busca linear e rastreamento de índices.*/

package atividades.exercicios04;

public class MaiorMenorPos {
    public static void main(String[] args) {
        int vet[] = {2, 6, 3, 10, 6, 5, 1, 9, 2, 8};
        int maior = vet[0]; 
        int posMaior=0;
        int posMenor=0;
        int menor = vet[0];


        for(int i=1;i<vet.length;i++) 
        {
            if(vet[i]<menor)
            {
                menor = vet[i];
                posMenor = i;
            }
            if(vet[i]>maior)
            {
                maior = vet[i];
                posMaior = i;
            }
        }
        System.out.println("Esse e o maior valor: " + maior + " e esta sua posicao: " + posMaior);
        System.out.println("Esse e o menor valor: " + menor + " e esta sua posicao: " + posMenor);
    }
}