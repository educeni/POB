package atividades.exercicios06.e4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int aumento = 10.0;

        System.out.print("Forneca o nome: ");
        String nome = sc.nextLine();

        System.out.print("Forneca o cargo: ");
        String cargo = sc.nextLine();

        System.out.print("Forneca o salario bruto: ");
        double salarioBruto = sc.nextDouble();

        Funcionario funcionario = new Funcionario(nome, cargo, salarioBruto);

        System.out.printf("O salario e de: %.2f\n", funcionario.getSalarioBruto());

        funcionario.aplicarAumento(aumento);

        System.out.printf("O salario apos o aumento e de: %.2f\n", funcionario.getSalarioBruto());

        System.out.print("Forneca o desconto: ");
        double descontoImposto = sc.nextDouble();

        double salarioLiquido = funcionario.calcularSalarioLiquido(descontoImposto);

        System.out.printf("Assim ficou o salario liquido: %.2f", salarioLiquido);
    }
}