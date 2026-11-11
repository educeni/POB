package atividades.exercicios11.e5.controle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import atividades.exercicios11.e5.dominio.Produto;

public class Main {

    public static void main(String[] args) {
        // Criando uma lista de produtos
        List<Produto> produtos = Arrays.asList(
            new Produto("Shampoo", "Higiene", 25.00),
            new Produto("Sabonete", "Higiene", 5.00),
            new Produto("Arroz", "Alimentos", 20.00),
            new Produto("Feijão", "Alimentos", 8.00),
            new Produto("Livro Java", "Livros", 60.00),
            new Produto("Livro SQL", "Livros", 45.00),
            new Produto("Condicionador", "Higiene", 30.00)
        );

        // Criando o HashMap para agrupar os produtos
        HashMap<String, List<Produto>> produtosPorCategoria =
            new HashMap<>();

        // Percorrendo a lista de produtos
        produtos.forEach(produto -> {

            // Verifica se a categoria já existe no HashMap
            if (!produtosPorCategoria.containsKey(produto.getCategoria())) {

                // Se não existir, cria uma nova lista
                produtosPorCategoria.put(
                    produto.getCategoria(),
                    new ArrayList<>()
                );
            }

            // Adiciona o produto na lista da sua categoria
            produtosPorCategoria.get(produto.getCategoria())
                .add(produto);

        });


        // Exibindo os produtos agrupados
        produtosPorCategoria.forEach((categoria, listaProdutos) -> {
            System.out.println("\nCategoria: " + categoria);
            listaProdutos.forEach(produto -> {
                System.out.println(produto);
            });
        });
    }
}