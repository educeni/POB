package atividades.exercicios12.e1;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> nomes = Arrays.asList(
            "ana", "carlos", "beatriz",
            "antonio", "amanda", "bernardo"
        );

        // Filtrar, transformar e ordenar os nomes
        List<String> resultado = nomes.stream()

            // Filtra nomes que começam com A
            .filter(nome -> nome.toLowerCase().startsWith("a"))

            // Transforma os nomes em letras maiúsculas
            .map(nome -> nome.toUpperCase())

            // Ordena em ordem alfabética
            .sorted()

            // Armazena em uma nova lista
            .toList();

        // Exibe o resultado
        System.out.println(resultado);
    }
}

