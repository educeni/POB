package atividades.exercicios08.e4.dominio;

public class Retangulo extends FiguraGeometrica{
    private double largura;
    private double altura;

    public Quadrado(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return largura * altura;
    }
}