package atividades.exercicios06.e3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Forneca o nome do titular: ");
        String titular = sc.nextLine();

        System.out.print("Forneca o numero da conta bancaria: ");
        String numeroConta = sc.nextLine();

        ContaBancaria conta1 = new ContaBancaria(titular, numeroConta);

        System.out.print("Forneca o valor para ser depositado: ");
        double valor = sc.nextDouble();

        conta1.depositar(valor);

        System.out.print("Forneca o valor de saque da conta: ");
        double saque = sc.nextDouble(); 

        conta1.sacar(saque);
        
        conta1.consultarSaldo();
        sc.close();
    }
}