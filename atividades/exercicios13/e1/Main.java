package atividades.exercicios13.e1;


import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        // Definindo o caminho do diretório
        Path diretorio = Path.of("dados", "relatorios");

        // Definindo o caminho do arquivo
        Path arquivo = diretorio.resolve("sumario.txt");

        try {

            // Verifica se o diretório existe
            if (!Files.exists(diretorio)) {

                // Cria o diretório
                Files.createDirectories(diretorio);

                System.out.println("Diretório criado!");
            }

            // Obtendo a data e hora atual
            LocalDateTime agora = LocalDateTime.now();

            DateTimeFormatter formato =
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

            String data = agora.format(formato);

            // Criando o conteúdo do relatório
            String relatorio =
                "RELATÓRIO DO SISTEMA\n" +
                "-------------------------\n" +
                "Execução realizada com sucesso!\n" +
                "Data e hora: " + data + "\n" +
                "Diretório: " + diretorio + "\n" +
                "Arquivo: sumario.txt\n";

            // Escrevendo no arquivo
            Files.writeString(
                arquivo,
                relatorio,
                StandardOpenOption.CREATE,
                StandardOpenOption.TRUNCATE_EXISTING
            );

            System.out.println("Relatório criado com sucesso!");

        } catch (IOException e) {

            System.out.println("Erro ao criar relatório: " + e.getMessage());

        }
    }
}