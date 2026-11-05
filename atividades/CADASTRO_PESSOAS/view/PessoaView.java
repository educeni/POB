package atividades.CADASTRO_PESSOAS.view;

import atividades.CADASTRO_PESSOAS.controller.*;
import atividades.CADASTRO_PESSOAS.model.Pessoas;
import java.util.Scanner;
import java.util.InputMismatchException;

public class PessoaView{
    // Instância do controlador que gerencia a lógica de negócio
    private controlaPessoa controller;
    
    // Scanner usado para ler entradas do usuário
    private Scanner scanner;

    // Construtor que recebe o controller como dependência e inicializa o scanner
    public PessoaView(controlaPessoa controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    // Método que exibe o menu principal e executa ações com base na escolha do usuário
    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Alterar Produto");
            System.out.println("4. Excluir Produto");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            // Lê a opção do usuário com tratamento
            opcao = capturarInteiro();

            // Executa a ação correspondente
            switch (opcao) {
                case 1 -> adicionarProduto();
                case 2 -> listarProdutos();
                case 3 -> alterarProduto();
                case 4 -> excluirProduto();
                case 0 -> System.out.println("Encerrando o programa.");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0); // Repete até o usuário escolher sair
    }

    // Método para adicionar um novo produto
    private void adicionarPessoa() {
        int id = capturarId(); // Lê o ID
        String nome = capturarString("Nome da pessoa: ");
        double altura = capturarDouble("Altura da pessoa: ");
        int idade = capturarInteiro("Idade da pessoa: ");

        controller.incluirPessoa(id, nome, idade, altura); // Chama o controller
        System.out.println("Pessoa adicionada com sucesso!");
    }

    // Exibe todos os produtos cadastrados
    private void listarPessoas() {
        for (Produto pessoa : controller.listarPessoa()) {
            System.out.println("ID: " + pessoa.getId() + ", Nome: " + pessoa.getNome() + ", Altura:  " + pessoa.getAltura() + ", Idade: " + pessoa.getIdade());
        }
    }

    // Permite alterar um produto existente
    private void alterarPessoa() {
        int id = capturarId();
        String nome = capturarString("Novo Nome: ");
        int idade = capturarInt("Idade: ");
        double altura = capturarDouble("Altura: ");

        if (controller.alterarPessoa(id, nome, idade, altura)) {
            System.out.println("Pessoa alterada com sucesso!");
        } else {
            System.out.println("Pessoa com ID " + id + " não encontrado.");
        }
    }

    // Permite excluir um produto existente
    private void excluirPessoa() {
        int id = capturarId();
        if (controller.excluirPessoa(id)) {
            System.out.println("Pessoa excluída com sucesso!");
        } else {
            System.out.println("Pessoa com ID " + id + " não encontrado.");
        }
    }

    // Lê e retorna um ID de produto
    private int capturarId() {
        return capturarInteiro("ID do Produto: ");
    }

    // Captura um número inteiro sem mensagem (usado no menu)
    private int capturarInteiro() {
        return capturarInteiro(null);
    }

    // Captura um número inteiro com tratamento de erro e mensagem opcional
    private int capturarInteiro(String mensagem) {
        int valor = 0;
        boolean valido;
        do {
            try {
                if (mensagem != null) {
                    System.out.print(mensagem); // Exibe a mensagem, se houver
                }
                valor = scanner.nextInt(); // Lê número inteiro
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                valido = false;
                scanner.nextLine(); // Limpa o buffer do scanner
            }
        } while (!valido);
        scanner.nextLine(); // Limpa o buffer após leitura correta
        return valor;
    }

    // Captura um número decimal com tratamento de erro
    private double capturarDouble(String mensagem) {
        double valor = 0.0;
        boolean valido;
        do {
            try {
                System.out.print(mensagem);
                valor = scanner.nextDouble(); // Lê número decimal
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número decimal.");
                valido = false;
                scanner.nextLine(); // Limpa o buffer
            }
        } while (!valido);
        scanner.nextLine(); // Limpa o buffer
        return valor;
    }

    // Captura uma string após exibir uma mensagem
    private String capturarString(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine(); // Lê a linha inteira
    }
}
