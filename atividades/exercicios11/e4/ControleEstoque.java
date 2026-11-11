package atividades.exercicios11.e4;

import java.util.HashMap;

public class ControleEstoque {

    // Criando o HashMap
    private HashMap<String, Integer> estoque = new HashMap<>();


    // Método para inserir um novo produto
    public void inserirProduto(String codigo, int quantidade) {

        estoque.put(codigo, quantidade);

        System.out.println("Produto inserido com sucesso!");
    }


    // Método para atualizar o estoque
    public void atualizarEstoque(String codigo, int quantidade) {

        // Verifica se o código existe
        if (estoque.containsKey(codigo)) {

            // Pega a quantidade atual
            int quantidadeAtual = estoque.get(codigo);

            // Soma ou subtrai a quantidade
            int novaQuantidade = quantidadeAtual + quantidade;

            // Atualiza o valor no HashMap
            estoque.put(codigo, novaQuantidade);

            System.out.println("Estoque atualizado!");

        } else {

            System.out.println("Produto não encontrado!");
        }
    }


    // Método para consultar um produto
    public void consultarProduto(String codigo) {

        if (estoque.containsKey(codigo)) {

            System.out.println(
                "Código: " + codigo +
                " | Quantidade: " + estoque.get(codigo)
            );

        } else {

            System.out.println("Produto não encontrado!");
        }
    }


    // Método para listar produtos com estoque baixo
    public void listarEstoqueBaixo(int limite) {

        System.out.println("\nProdutos com estoque baixo:");

        estoque.forEach((codigo, quantidade) -> {

            if (quantidade <= limite) {

                System.out.println(
                    "Código: " + codigo +
                    " | Quantidade: " + quantidade
                );
            }
        });
    }


    // Método para exibir todos os produtos
    public void listarTodos() {

        estoque.forEach((codigo, quantidade) -> {

            System.out.println(
                "Código: " + codigo +
                " | Quantidade: " + quantidade
            );
        });
    }
}