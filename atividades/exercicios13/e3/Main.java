package atividades.exercicios13.e3;


import java.nio.file.Path;
import java.nio.file.Files;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Path arquivo = Path.of("produtos.csv");

        try {

            // Lê todas as linhas do arquivo
            List<String> linhas = Files.readAllLines(arquivo);

            // Variável para armazenar o total do inventário
            double totalInventario = 0;

            // Percorre as linhas, começando pela segunda
            for (int i = 1; i < linhas.size(); i++) {

                try {

                    // Divide os campos utilizando a vírgula
                    String[] campos = linhas.get(i).split(",");

                    // Obtém os dados do produto
                    String nome = campos[0];

                    int quantidade = Integer.parseInt(campos[1]);

                    double preco = Double.parseDouble(campos[2]);

                    // Calcula o valor total do produto
                    double totalProduto = quantidade * preco;

                    // Soma ao inventário
                    totalInventario += totalProduto;

                    // Exibe as informações
                    System.out.println(
                        "Produto: " + nome +
                        " | Quantidade: " + quantidade +
                        " | Preço: R$ " + preco +
                        " | Total: R$ " + totalProduto
                    );

                } catch (NumberFormatException e) {

                    System.out.println(
                        "Erro: quantidade ou preço inválido na linha " + (i + 1)
                    );

                } catch (ArrayIndexOutOfBoundsException e) {

                    System.out.println(
                        "Erro: quantidade de campos inválida na linha " + (i + 1)
                    );

                }

            }

            // Exibe o total geral
            System.out.println("\nValor total do inventário: R$ " +
                totalInventario);

        } catch (IOException e) {

            System.out.println(
                "Erro ao ler arquivo: " + e.getMessage()
            );

        }

    }
}