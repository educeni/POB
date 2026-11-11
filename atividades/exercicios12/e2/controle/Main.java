package atividades.exercicios12.e2.controle;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.Optional;
import atividades.exercicios12.e2.dominio.Produto;

public class Main {

    public static void main(String[] args) {

        // Criando uma lista com 6 produtos
        List<Produto> produtos = Arrays.asList(
            new Produto("Mouse", 80.00),
            new Produto("Teclado", 150.00),
            new Produto("Monitor", 900.00),
            new Produto("Headset", 200.00),
            new Produto("Notebook", 3500.00),
            new Produto("Webcam", 180.00)
        );

        // 1. Soma dos preços dos produtos
        double total = produtos.stream()
            .mapToDouble(produto -> produto.getPreco())
            .sum();

        System.out.println("Valor total: R$ " + total);


        // 2. Média dos preços dos produtos
        double media = produtos.stream()
            .mapToDouble(produto -> produto.getPreco())
            .average()
            .orElse(0);

        System.out.println("Preço médio: R$ " + media);


        // 3. Produto com maior preço
        Optional<Produto> maiorPreco = produtos.stream()
            .max(Comparator.comparingDouble(
                produto -> produto.getPreco()
            ));

        System.out.println("Produto mais caro: " +
            maiorPreco.orElse(null));
    }
}
