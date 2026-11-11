package atividades.exercicios13.e5;

import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // Caminho do arquivo original
        Path arquivoEntrada = Path.of("clientes_bruto.txt");

        // Caminho do novo arquivo
        Path arquivoSaida = Path.of("clientes_padronizado.txt");

        try (Stream<String> linhas = Files.lines(arquivoEntrada)) {

            // Processamento das linhas
            List<String> clientes = linhas

                // Remove espaços do início e do final
                .map(nome -> nome.trim())

                // Remove linhas vazias
                .filter(nome -> !nome.isBlank())

                // Padroniza os nomes
                .map(nome ->
                    nome.substring(0, 1).toUpperCase() +
                    nome.substring(1).toLowerCase()
                )

                // Armazena em uma lista
                .collect(Collectors.toList());


            // Grava os nomes no novo arquivo
            Files.write(
                arquivoSaida,
                clientes,
                StandardCharsets.UTF_8,
                StandardOpenOption.CREATE,
                StandardOpenOption.TRUNCATE_EXISTING
            );

            System.out.println("Arquivo criado com sucesso!");

            System.out.println("\nClientes padronizados:");

            clientes.forEach(nome -> System.out.println(nome));


        } catch (IOException e) {

            System.out.println(
                "Erro ao processar arquivo: " + e.getMessage()
            );

        }

    }
}