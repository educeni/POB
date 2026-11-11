package atividades.exercicios12.e5.controle;

import atividades.exercicios12.e5.dominio.Funcionario;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        // Criando uma lista de funcionários
        List<Funcionario> funcionarios = Arrays.asList(

            new Funcionario("Ana", "TI", 3000.00),
            new Funcionario("Carlos", "RH", 2500.00),
            new Funcionario("Beatriz", "TI", 4000.00),
            new Funcionario("Pedro", "Financeiro", 3500.00),
            new Funcionario("Mariana", "TI", 5000.00),
            new Funcionario("Lucas", "RH", 2800.00)

        );


        // 1. Predicate: filtrar funcionários do departamento TI
        Predicate<Funcionario> filtro = funcionario ->
            funcionario.getDepartamento().equals("TI");


        // 2. Function: calcular salário com reajuste de 10%
        Function<Funcionario, Double> reajuste = funcionario ->
            funcionario.getSalario() * 1.10;


        // 3. Consumer: exibir salário projetado
        Consumer<Double> imprimir = salario -> {

            System.out.println(
                "Salário projetado: R$ " +
                String.format("%.2f", salario)
            );

        };


        // Pipeline utilizando Stream
        funcionarios.stream()

            // Filtra os funcionários
            .filter(filtro)

            // Calcula o novo salário
            .map(reajuste)

            // Exibe o resultado
            .forEach(imprimir);

    }
}