package atividades.exercicios11.e4;


public class Main {

    public static void main(String[] args) {

        ControleEstoque estoque = new ControleEstoque();

        // Inserindo produtos
        estoque.inserirProduto("P001", 10);
        estoque.inserirProduto("P002", 3);
        estoque.inserirProduto("P003", 0);
        estoque.inserirProduto("P004", 20);

        // Consultando um produto
        estoque.consultarProduto("P001");


        // Atualizando o estoque
        estoque.atualizarEstoque("P001", 5);

        // Subtraindo 2 unidades
        estoque.atualizarEstoque("P001", -2);


        // Consultando novamente
        estoque.consultarProduto("P001");

        // Exibindo todos os produtos
        System.out.println("\nTODOS OS PRODUTOS:");
        estoque.listarTodos();

        // Exibindo produtos com estoque igual ou inferior a 5
        estoque.listarEstoqueBaixo(5);
    }
}