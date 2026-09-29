/*Exercício 2: Conversão de Vetor com NumberFormatException e ArrayIndexOutOfBoundsException
Enunciado: Desenvolva um programa que contenha um vetor estático de Strings com 4 posições (ex: {"10", "25", "abc", "50"}). Solicite ao usuário um 
índice para acessar e converter o valor correspondente para um número inteiro (Integer.parseInt). Trate as exceções caso o usuário informe um índice 
inexistente ou se a string da posição escolhida não for um número válido.
Conceitos: Captura de exceções de índice fora do limite (ArrayIndexOutOfBoundsException) e falha de conversão numérica (NumberFormatException).*/

package atividades.exercicios10.e2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] vet = {"10", "25", "abc", "50"};
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Forneça o índice que deseja acessar (0 a 3): ");
            int i = sc.nextInt();

            int valorConvertido = Integer.parseInt(vet[i]);
            System.out.println("Valor convertido com sucesso: " + valorConvertido);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice inválido! O vetor possui posições de 0 a " + (vet.length - 1) + ".");
        } catch (NumberFormatException e) {
            System.out.println("Erro: A String na posição informada não é um número válido para conversão.");
        } catch (InputMismatchException e) {
            System.out.println("Erro: O índice digitado precisa ser um número inteiro.");
        } finally {
            System.out.println("Operação finalizada.");
            sc.close();
        }
    }
}