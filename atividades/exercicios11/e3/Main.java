/* Exercício 3: Dicionário de Frequência de Palavras (HashMap)
Enunciado: Escreva um programa que receba um texto (frase longa) do usuário, divida o texto em palavras separadas por espaços (utilizando .toLowerCase() e .split("\\s+")) e utilize um HashMap<String, Integer> para contar a quantidade de ocorrências de cada palavra. Ao final, percorra o mapa exibindo cada palavra e sua respectiva frequência.
Conceitos: Interface Map, pares chave-valor (put, getOrDefault), iteração sobre entrySet().
*/
package atividades.exercicios11.e3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto = scanner.nextLine();

        // Dividir o texto em palavras, convertendo para minúsculas
        String[] palavras = texto.toLowerCase().split("\\s+");

        // Criar um HashMap para armazenar a frequência das palavras
        Map<String, Integer> frequenciaPalavras = new HashMap<>();

        // Contar a frequência de cada palavra
        for (String palavra : palavras) {
            frequenciaPalavras.put(palavra, frequenciaPalavras.getOrDefault(palavra, 0) + 1);
        }

        // Exibir a frequência de cada palavra
        System.out.println("\nFrequência das palavras:");
        for (Map.Entry<String, Integer> entry : frequenciaPalavras.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }
}