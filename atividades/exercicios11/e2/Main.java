import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> turmaA = new HashSet<>();
        Set<Integer> turmaB = new HashSet<>();

        System.out.print("Quantos alunos serão cadastrados na Turma A? ");
        int qtdA = scanner.nextInt();
        for (int i = 0; i < qtdA; i++) {
            System.out.print("Digite a matrícula do aluno " + (i + 1) + " da Turma A: ");
            turmaA.add(scanner.nextInt());
        }

        System.out.print("\nQuantos alunos serão cadastrados na Turma B? ");
        int qtdB = scanner.nextInt();
        for (int i = 0; i < qtdB; i++) {
            System.out.print("Digite a matrícula do aluno " + (i + 1) + " da Turma B: ");
            turmaB.add(scanner.nextInt());
        }

        System.out.println("\nTurma A: " + turmaA);
        System.out.println("Turma B: " + turmaB);

        Set<Integer> uniao = new HashSet<>(turmaA);
        
        uniao.addAll(turmaB); 
        
        System.out.println("\n--- Alunos matriculados em pelo menos uma turma (União) ---");
        System.out.println(uniao);

        Set<Integer> intersecao = new HashSet<>(turmaA);

        intersecao.retainAll(turmaB);
        
        System.out.println("\n--- Alunos matriculados simultaneamente nas duas turmas (Interseção) ---");
        if (intersecao.isEmpty()) {
            System.out.println("Nenhum aluno está matriculado em ambas as turmas.");
        } else {
            System.out.println(intersecao);
        }

        scanner.close();
    }
}