package atividades.exercicios07.e5.controle;

import atividades.exercicios07.e5.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        System.out.println("=== 1. CRIAÇÃO DO FUNCIONÁRIO ===");
        Funcionario func = new Funcionario("Carlos Eduardo", "M-8842", 3000.00);
        func.exibirDados();

        System.out.println("\n=== 2. TESTE DE AUMENTO SALARIAL VÁLIDO ===");
        System.out.println("Tentando alterar salário para R$ 3.500,00...");
        func.setSalario(3500.00);
        System.out.println("Salário Atual: R$ " + func.getSalario()); 

        System.out.println("\n=== 3. TESTE DE TENTATIVA DE REDUÇÃO SALARIAL ===");
        System.out.println("Tentando alterar salário para R$ 2.800,00...");
        func.setSalario(2800.00);
        System.out.println("Salário mantido: R$ " + func.getSalario());

        System.out.println("\n=== 4. TESTE DE MANUTENÇÃO DO MESMO SALÁRIO ===");
        System.out.println("Tentando alterar salário para os mesmos R$ 3.500,00...");
        func.setSalario(3500.00);
        System.out.println("Salário mantido: R$ " + func.getSalario());

        System.out.println("\n=== 5. RELATÓRIO FINAL ===");
        func.exibirDados();
    }
}