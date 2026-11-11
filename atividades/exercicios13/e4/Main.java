package atividades.exercicios13.e4;


import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // Definindo a pasta que será percorrida
        Path pasta = Path.of("src");

        // Variável para armazenar o tamanho total
        final long[] tamanhoTotal = {0};

        try (Stream<Path> arquivos = Files.walk(pasta)) {

            // Filtrando os arquivos
            arquivos

                // Verifica se é um arquivo regular
                .filter(Files::isRegularFile)

                // Seleciona somente arquivos .java
                .filter(arquivo ->
                    arquivo.toString().endsWith(".java")
                )

                // Percorre os arquivos encontrados
                .forEach(arquivo -> {

                    try {

                        // Obtém o caminho relativo
                        Path caminhoRelativo = pasta.relativize(arquivo);

                        // Obtém o tamanho do arquivo
                        long tamanho = Files.size(arquivo);

                        // Exibe as informações
                        System.out.println(
                            "Arquivo: " + caminhoRelativo +
                            " | Tamanho: " + tamanho + " bytes"
                        );

                        // Soma o tamanho
                        tamanhoTotal[0] += tamanho;

                    } catch (IOException e) {

                        System.out.println(
                            "Erro ao consultar arquivo: " +
                            e.getMessage()
                        );

                    }

                });

            // Exibe o tamanho total
            System.out.println(
                "\nTamanho total dos arquivos Java: " +
                tamanhoTotal[0] + " bytes"
            );

        } catch (IOException e) {

            System.out.println(
                "Erro ao percorrer diretório: " +
                e.getMessage()
            );

        }

    }
}