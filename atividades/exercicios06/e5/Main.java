package atividades.exercicios06.e5;

public class Main{
    public static void main(String[] args){
        String nome = "Eduardo";
        String matricula = "40028922";
        double nota1 = 7.6;
        double nota2 = 9.3;

        Aluno aluno1 = new Aluno(nome, matricula, nota1, nota2);

        aluno1.imprimirBoletim();
    }
}