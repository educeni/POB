/*Exercício 1: Modelagem da Classe Livro
Enunciado: Crie uma classe chamada Livro com os atributos titulo (String), autor (String) e numeroPaginas (int). 
Implemente um método exibirInformacoes() que imprima no console todos os dados formatados. 
Na classe principal (Main), instancie dois objetos do tipo Livro, atribua valores a seus atributos e chame o método de exibição para ambos.
Conceitos: Definição de classe, atributos, instanciação de objetos com new, atribuição via operador ponto (.) e invocação de métodos.*/

package atividades.exercicios06.e1.dominio;

import java.util.Scanner;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public void exibirInformacoes() {
        System.out.printf("\n%s\n%s\n%d\n" , titulo , autor , numeroPaginas);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Livro livro1 = new Livro();

        System.out.printf("Forneca o titulo do livro: ");
        livro1.titulo = sc.nextLine();

        System.out.printf("Forneca o autor do livro: ");
        livro1.autor = sc.nextLine();

        System.out.printf("Forneca quantas paginas tem o livro: ");
        livro1.numeroPaginas = sc.nextInt();

        sc.nextLine();

        Livro livro2 = new Livro();

        System.out.printf("Forneca o titulo do segundo livro: ");
        livro2.titulo = sc.nextLine();

        System.out.printf("Forneca o autor do segundo livro: ");
        livro2.autor = sc.nextLine();

        System.out.printf("Forneca quantas paginas tem o segundo livro: ");
        livro2.numeroPaginas = sc.nextInt();

        livro1.exibirInformacoes();
        livro2.exibirInformacoes();

        sc.close();
    }

    
}