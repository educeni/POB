/* Exercício 2: Hierarquia de Formas com Classe Abstrata (abstract)

Enunciado: Crie uma classe abstrata Forma que contenha:

Um atributo protegido cor (String) e seu respectivo construtor/getter.
O método abstrato double calcularArea().
O método concreto void exibirCor() que imprime "Cor da forma: " + cor.
Em seguida, crie as subclasses concretas Retangulo (com largura e altura) e Circulo (com raio), ambas implementando obrigatoriamente o método calcularArea().

Conceitos: Classes e métodos abstratos (abstract), construtores em classes abstratas e combinação de métodos concretos e abstratos.
*/

package atividades.exercicios09.e2.dominio;

public abstract class Forma{
    protected String cor;
    
    public Forma(String cor){
        this.cor = cor;

    }

    public String getCor() {
        return cor;
    }

    public abstract double calcularArea();

    public void exibirCor(){
        System.out.println("Cor da forma: " + cor);

    }
}