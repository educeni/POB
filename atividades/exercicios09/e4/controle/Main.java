package atividades.exercicios09.e4.controle;

import atividades.exercicios09.e4.dominio.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        // Criando a lista polimórfica (aceita qualquer classe filha de ContaBancaria)
        List<ContaBancaria> contas = new ArrayList<>();

        // Instanciando as contas com saldos iniciais
        ContaBancaria c1 = new ContaCorrente(111, 1000.00);
        ContaBancaria c2 = new ContaEmpresarial(222, 10000.00);

        // Adicionando na lista
        contas.add(c1);
        contas.add(c2);

        System.out.println("--- Rotina de Virada de Mês ---\n");

        // O famoso for-each para percorrer a lista
        for (ContaBancaria conta : contas) {
            // Mostrando o saldo antes da taxa
            System.out.println("Conta Nº: " + conta.getNumero());
            System.out.printf("Saldo ANTES da taxa: R$ %.2f%n", conta.consultarSaldo());
            
            // Chamando o método abstrato (Aqui acontece o Polimorfismo!)
            conta.cobrarTaxaMensal();
            
            // Mostrando o saldo depois da taxa
            System.out.printf("Saldo DEPOIS da taxa: R$ %.2f%n", conta.consultarSaldo());
            System.out.println("---------------------------------");
        }
    }
}