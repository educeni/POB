/* Exercício 1: Hierarquia de Veículos e Sobrescrita Básica
Enunciado: Crie uma superclasse Veiculo com os atributos marca (String) e modelo (String), além de um método exibirDetalhes(). Em seguida, crie duas subclasses:
Carro: adiciona o atributo quantidadePortas (int) e sobrescreve exibirDetalhes().
Moto: adiciona o atributo cilindradas (int) e sobrescreve exibirDetalhes().
Utilize a palavra-chave super nos construtores das subclasses para reaproveitar a inicialização da classe base e no método sobrescrito.
Conceitos: Herança (extends), construtor da superclasse (super()) e sobrescrita de métodos (@Override). */

package atividades.exercicios08.e1.dominio;

class Veiculo {
    protected String marca;
    protected String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}

class Carro extends Veiculo {
    private int quantidadePortas;

    public Carro(String marca, String modelo, int quantidadePortas) {
        super(marca, modelo);
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Quantidade de portas: " + quantidadePortas);
    }
}

class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int cilindradas) {
        super(marca, modelo);
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Cilindradas: " + cilindradas);
    }
}

public class MainExercicio1 {
    public static void main(String[] args) {
        Veiculo carro = new Carro("Toyota", "Corolla", 4);
        Veiculo moto = new Moto("Honda", "CB500", 500);

        carro.exibirDetalhes();
        System.out.println("---");
        moto.exibirDetalhes();
    }
}