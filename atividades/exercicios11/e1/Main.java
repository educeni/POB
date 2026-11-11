package atividades.exercicios11.e1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> tarefas = new ArrayList<>();

        // 1. Adicionar 5 tarefas iniciais informadas pelo usuário
        System.out.println("Cadastro de Tarefas");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a " + i + "ª tarefa: ");
            String novaTarefa = scanner.nextLine();
            tarefas.add(novaTarefa);
        }
        System.out.println("\nLista de tarefas atual: " + tarefas);

        // 2. Remover uma tarefa específica pelo nome
        System.out.println("\nRemover Tarefa");
        System.out.print("Digite o nome da tarefa que deseja remover: ");
        String tarefaParaRemover = scanner.nextLine();
        boolean removeu = tarefas.remove(tarefaParaRemover);
        if (removeu) {
            System.out.println("Tarefa removida com sucesso!");
        } else {
            System.out.println("Tarefa não encontrada na lista.");
        }

        // 3. Verificar se uma tarefa específica existe na lista
        System.out.println("\nBuscar Tarefa");
        System.out.print("Digite uma tarefa para verificar se ela existe: ");
        String tarefaParaBuscar = scanner.nextLine();
        if (tarefas.contains(tarefaParaBuscar)) {
            System.out.println("Sim! A tarefa '" + tarefaParaBuscar + "' está na lista.");
        } else {
            System.out.println("Não, a tarefa '" + tarefaParaBuscar + "' NÃO está na lista.");
        }

        // 4. Exibir a lista ordenada alfabeticamente
        Collections.sort(tarefas);
        for (String t : tarefas) {
            System.out.println("- " + t);
        }
        scanner.close();
    }
}