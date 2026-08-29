/* Exercício 5: Classificação de Triângulos

Enunciado: Crie um programa que leia os três lados de um triângulo (A, B e C). Primeiro, verifique se as medidas formam um triângulo válido 
(a soma de dois lados quaisquer deve ser sempre maior que o terceiro lado). Se for válido, classifique-o como:

Equilátero: Todos os três lados iguais.
Isósceles: Apenas dois lados iguais.
Escaleno: Todos os três lados diferentes.
Se não formar um triângulo, exiba uma mensagem de erro.
Conceitos: Condicionais aninhadas, validação de dados prévia e operadores de igualdade/desigualdade (==, !=). */

package atividades.exercicio02;

import java.util.Scanner;

public class VerificaTriangulos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Forneca um lado do triangulo: ");
        double l1 = sc.nextDouble();

        System.out.print("Forneca outro lado do triangulo: ");
        double l2 = sc.nextDouble();

        System.out.print("Forneca o ultimo lado do triangulo: ");
        double l3 = sc.nextDouble();

        if((l1+l2 > l3) && (l2+l3 > l1) && (l1+l3 > l2)) {
            if((l1==l2) && (l1==l3))
                System.out.println("Esse eh um triangulo equilatero. "); 
            else if((l1==l2)||(l2==l3)|| (l1==l3))
                System.out.println("Esse eh um triangulo isosceles ");
            else 
                System.out.println("Esse eh um triangulo escaleno ");
        }
        else {
            System.out.println("ERRO: Esse nao eh um triangulo valido. ");
        }
        sc.close();
    }
}