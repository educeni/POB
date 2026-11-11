package atividades.exercicios09.e5.controle;

import atividades.exercicios09.e5.dominio.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    // Função que calcula o total de impostos de uma lista
    public static void calcularTotalImpostos(List<Tributavel> itensTributaveis) {
        double totalImpostos = 0.0;
        
        System.out.println("--- Calculando Impostos ---");
        
        for (Tributavel item : itensTributaveis) {
            double impostoDoItem = item.calcularTributo();
            totalImpostos += impostoDoItem;
            
            // Como a lista é de "Tributavel", não temos acesso ao getCodigo() aqui diretamente.
            // Mas podemos imprimir o valor do imposto calculado.
            System.out.printf("Imposto deste item: R$ %.2f%n", impostoDoItem);
        }
        
        System.out.printf("TOTAL DE IMPOSTOS A RECOLHER: R$ %.2f%n", totalImpostos);
    }

    public static void main(String[] args) {
        // Criando os itens
        Eletronico tv = new Eletronico(101, 2000.00);
        Eletronico celular = new Eletronico(102, 1500.00);

        // 1. Criando a lista de itens tributáveis
        List<Tributavel> listaTributaveis = new ArrayList<>();
        
        // listaTributaveis.add(pipoca); 
        listaTributaveis.add(tv);       
        listaTributaveis.add(celular);  

        // Chamando a função com a lista
        calcularTotalImpostos(listaTributaveis);
    }
}
