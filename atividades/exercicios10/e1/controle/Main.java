/* Exercício 1: Divisão Segura com Múltiplos Blocos catch e finally
Enunciado: Crie um programa que solicite ao usuário dois números inteiros e realize a divisão do primeiro pelo segundo. 
Trate especificamente as seguintes situações: 
Divisão por zero (ArithmeticException).
Entrada de dados não numéricos (InputMismatchException).
Utilize o bloco finally para garantir a exibição da mensagem "Operação finalizada." e o fechamento do recurso Scanner.
Conceitos: Blocos try-catch múltiplos, tratamento de exceções nativas da biblioteca padrão e garantia de liberação de recursos com finally.*/

package atividades.exercicios10.e1.controle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Forneça o primeiro número inteiro: ");
            int n1 = sc.nextInt();

            System.out.print("Forneça o segundo número inteiro: ");
            int n2 = sc.nextInt();

            int resultado = n1 / n2;
            System.out.println("Resultado da divisão: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é possível dividir por zero!");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Por favor, insira apenas números inteiros.");
        } finally {
            System.out.println("Operação finalizada.");
            sc.close();
        }
    }
}