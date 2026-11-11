package atividades.exercicios12.e3.controle;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import atividades.exercicios12.e3.dominio.Aluno;

public class Main {

    public static void main(String[] args) {

        // Criando uma lista de alunos
        List<Aluno> alunos = Arrays.asList(
            new Aluno("Ana", "Java", 9.0),
            new Aluno("Carlos", "Python", 6.5),
            new Aluno("Beatriz", "Java", 8.0),
            new Aluno("Pedro", "Python", 5.0),
            new Aluno("Mariana", "Java", 7.5),
            new Aluno("Lucas", "PHP", 4.0),
            new Aluno("João", "PHP", 8.5)
        );


        // 1. Agrupar os alunos pelo curso
        Map<String, List<Aluno>> alunosPorCurso =
            alunos.stream()
                .collect(Collectors.groupingBy(
                    aluno -> aluno.getCurso()
                ));

        System.out.println("ALUNOS POR CURSO:");

        alunosPorCurso.forEach((curso, listaAlunos) -> {
            System.out.println("\nCurso: " + curso);

            listaAlunos.forEach(aluno ->
                System.out.println(aluno)
            );
        });


        // 2. Separar aprovados e reprovados
        Map<Boolean, List<Aluno>> resultado =
            alunos.stream()
                .collect(Collectors.partitioningBy(
                    aluno -> aluno.getNotaFinal() > 7.0
                ));

        System.out.println("\nAPROVADOS:");

        resultado.get(true).forEach(aluno ->
            System.out.println(aluno)
        );

        System.out.println("\nREPROVADOS:");

        resultado.get(false).forEach(aluno ->
            System.out.println(aluno)
        );
    }
}