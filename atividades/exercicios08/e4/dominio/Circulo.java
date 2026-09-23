package atividades.exercicios08.e4.dominio;

public class Circulo extends FiguraGeometrica{
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double calcularArea(){
        return (raio * raio) * 3.14;
    }
}