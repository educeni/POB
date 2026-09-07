package atividades.exercicios06.e1.controle;
import java.util.Scanner;


public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Forneca o titulo do livro: ");
        livro1.titulo = sc.nextLine();

        System.out.printf("Forneca o autor do livro: ");
        livro1.autor = sc.nextLine();

        System.out.printf("Forneca quantas paginas tem o livro: ");
        livro1.numeroPaginas = sc.nextInt();

        sc.nextLine();

        Livro livro1 = new Livro(titulo, autor, numeroPaginas);

        System.out.printf("Forneca o titulo do segundo livro: ");
        livro2.titulo = sc.nextLine();

        System.out.printf("Forneca o autor do segundo livro: ");
        livro2.autor = sc.nextLine();

        System.out.printf("Forneca quantas paginas tem o segundo livro: ");
        livro2.numeroPaginas = sc.nextInt();

        Livro livro2 = new Livro(titulo, autor, numeroPaginas);

        livro1.exibirInformacoes();
        livro2.exibirInformacoes();

        sc.close();
    }