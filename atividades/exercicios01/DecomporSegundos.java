/*  Exercício 5: Conversor de Tempo (Segundos para Horas, Minutos e Segundos)
Enunciado: Escreva um programa que leia um valor inteiro representando um total de segundos e o decomponha em horas, minutos e 
segundos restantes. Conceitos: Divisão inteira (/) e operador de resto da divisão (%).
Exemplo de Entrada: 3665 Saída esperada: 1 hora(s), 1 minuto(s) e 5 segundo(s)
*/

package atividades.exercicios01;

import java.util.Scanner;

public class DecomporSegundos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Forneca os segundos: ");
        int segundos = sc.nextInt();
        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        segundos = segundos % 60;
        
        System.out.println(horas + " hora(s), " + minutos + " minuto(s) e " + segundos + " segundo(s)");
        sc.close();
    }


}
