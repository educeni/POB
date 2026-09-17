/* Exercício 3: Classe Retangulo com Validação nos Métodos Setters
Enunciado: Desenvolva uma classe Retangulo com os atributos privados largura (double) e altura (double).
O construtor deve inicializar ambos os atributos utilizando os próprios métodos setters para garantir que as regras de validação sejam aplicadas desde a instanciação.
Nos setters de largura e altura, garanta que o valor atribuído seja estritamente maior que zero; se for $\le 0$, atribua um valor padrão de 1.0 e 
emita um aviso no console.
Implemente os métodos calcularArea() e calcularPerimetro().
Conceitos: Reutilização de regras de validação chamando setters dentro do construtor, consistência de objetos válidos.*/

package atividades.exercicios07.e3.dominio;

public class Retangulo{
    private double largura;
    private double altura;

    //Construtor
    public Retangulo(double altura, double largura){
        setAltura(altura);
        setLargura(largura);
    }

    //Getters
    public double getAltura()
    {
        return this.altura;
    }

    public double getLargura()
    {
        return this.largura;
    }

    //Setters
    public void setAltura(double altura){
        if(altura>0) {
            this.altura = altura;
        }
        else {
            this.altura = 1.0;
            System.out.print("Valor de altura fornecido eh invalido. Foi definido como 1.0\n");
        }
    }

    public void setLargura(double largura){
        if(largura>0) {
            this.largura = largura;
        }
        else {
            this.largura = 1.0;
            System.out.print("Valor de largura fornecido eh invalido. Foi definido como 1.0\n");
        }
    }

    public double calcularArea() {
        return (this.altura * this.largura);
    }

    public double calcularPerimetro(){
        return (this.altura * 2) + (this.largura * 2);
    }
}