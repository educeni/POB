package atividades.exercicios13.e2;


import java.nio.file.Path;
import java.nio.file.Files;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Path arquivo = Path.of("servidor.log");

        try (Stream<String> linhas = Files.lines(arquivo)) {

            // Filtra apenas as linhas de erro
            List<String> erros = linhas

                .filter(linha -> linha.contains("[ERROR]"))

                // Remove o prefixo [ERROR]
                .map(linha -> linha.replace("[ERROR]", "").trim())

                // Armazena o resultado em uma lista
                .collect(Collectors.toList());


            // Conta a quantidade de erros
            long quantidade = erros.size();

            System.out.println("Total de erros: " + quantidade);


            // Exibe as mensagens encontradas
            System.out.println("\nMensagens de erro:");

            erros.forEach(mensagem -> {

                System.out.println(mensagem);

            });


        } catch (IOException e) {

            System.out.println("Erro ao ler arquivo: " + e.getMessage());

        }

    }
}