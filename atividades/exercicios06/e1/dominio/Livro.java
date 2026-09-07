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

    //Construtor 
    public Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
        this.autor = autor; 
    } 

    //Getters
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    //Setters
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirInformacoes() {
        System.out.printf("\n%s\n%s\n%d\n" , titulo , autor , numeroPaginas);
    }
}