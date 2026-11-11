package atividades.exercicios11.controller;

import atividades.exercicios11.model.*;
import atividades.exercicios11.view.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ControlaTarefa {
    private ArrayList<Tarefa> tarefas;
    Scanner sc = new Scanner(System.in);

    public boolean excluiTarefa(int indice, String nome) {
        Tarefa tarefa = buscaTarefaPorIdOuNome(indice, nome);

        if(tarefa!= null) {
            tarefas.remove(tarefa);
            return true;
        }
        else 
            return false;
    }

    private Tarefa buscaTarefaPorIdOuNome(int id, String nome){
        for(Tarefa tarefa : tarefas){
            if(tarefa.getId() == id){
                return tarefa;
            }
            else if(tarefa.getNome().equalsIgnoreCase(nome))
                return tarefa;
        }
        return null;
    }


    public static void main(String[] args) {
        try{
            for(int i=0; i<5;i++)   {
                System.out.println("Forneca o nome da tarefa: ");
                String nome = sc.nextLine();

                System.out.println("Forneca o indice da tarefa: ");
                int indice = sc.nextInt();
                sc.nextLine();

                System.out.println("Forneca a descricao da tarefa: ");
                String desc = sc.nextLine();

                Tarefa tarefa = new Tarefa(indice, nome, desc);
            }


            removeTarefa(indice, nome);

            // exibindo em ordem alfabetica
            Collections.sort(tarefa);
        }
        catch(InputMismatchException e){

        }
    }
}