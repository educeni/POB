/* Exercício 5: Classe Aluno com Cálculo de Situação Acadêmica
Enunciado: Crie uma classe Aluno contendo os atributos nome (String), matricula (String), nota1 (double) e nota2 (double). Implemente os métodos:
calcularMedia(): retorna a média aritmética simples das duas notas.
verificarAprovacao(): retorna uma String ("Aprovado" se média > 7, caso contrário "Reprovado").
imprimirBoletim(): exibe o nome, a matrícula, a média final e a situação do aluno.
Na classe Main, crie um objeto Aluno, preencha suas notas e acione o método imprimirBoletim().
Conceitos: Chamada de métodos dentro de outros métodos da mesma classe (this.calcularMedia()) e abstração de regras de negócio.*/

package atividades.exercicios06.e5;

public class Aluno {
    String nome;
    String matricula;
    double nota1;
    double nota2;

    //Construtor    
    public Aluno(String nome, String matricula, double nota1, double nota2){
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    //Getters
    public String getNome(){
        return nome;
    }

    public String getMatricula(){
        return matricula;
    }

    public double getNota1(){
        return nota1;
    }

    public double getNota2(){
        return nota2;
    }

    //Setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public void setNota1(double nota1){
        this.nota1 = nota1;
    }

    public void setNota2(double nota2){
        this.nota2 = nota2;
    }

    //Metodos
    public double calcularMedia(){
        return (this.nota1 + this.nota2) / 2;
    }

    public String verificarAprovacao(){
        double media = this.calcularMedia();
        if(media > 7){
            String mensagem = "Aprovado!";
            return mensagem;
        }
        else
        {
            String mensagem = "Reprovado!";
            return mensagem;
        }
    }

    public void imprimirBoletim(){
        String situacao = this.verificarAprovacao();
        double media = this.calcularMedia();
        System.out.printf("NOME\tMATRICULA\tMEDIA\tSITUACAO\n ");
        System.out.printf("%s\t%s\t%.2f\t%s\n", this.nome, this.matricula, media, situacao);
    }
}