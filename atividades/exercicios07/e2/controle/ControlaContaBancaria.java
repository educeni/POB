package atividades.exercicios07.e2.controle;

import atividades.exercicios07.e2.dominio;

public class ControlaContaBancaria{
    public static void main(){
        ContaBancaria conta = new ContaBancaria("1234", "Jobielson");

        System.out.println("=== DADOS INICIAIS DA CONTA ===");
        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo Inicial: R$ " + conta.getSaldo());
        System.out.println("-----------------------------------");

        System.out.println("\n--- Teste 1: Depósito Válido (R$ 500,00) ---");
        conta.depositar(500.0);
        System.out.println("Saldo Atual: R$ " + conta.getSaldo());

        System.out.println("\n--- Teste 2: Tentativa de Depósito Inválido (R$ -50,00) ---");
        conta.depositar(-50.0);
        System.out.println("Saldo Atual (Não deve ter mudado): R$ " + conta.getSaldo());

        System.out.println("\n--- Teste 3: Saque Válido (R$ 200,00) ---");
        conta.sacar(200.0);
        System.out.println("Saldo Atual: R$ " + conta.getSaldo());

        System.out.println("\n--- Teste 4: Tentativa de Saque com Saldo Insuficiente (R$ 400,00) ---");
        conta.sacar(400.0);
        System.out.println("Saldo Atual (Não deve ter mudado): R$ " + conta.getSaldo());

        System.out.println("\n--- Teste 5: Alteração de Titular ---");
        conta.setTitular("Maria Silva Santos");
        System.out.println("Novo Titular: " + conta.getTitular());
    }
}