package atividades.exercicios08.e4.controle;

import atividades.exercicios08.e4.dominio.Circulo.*;

public class Main {
    public static void main(String[] args) {

        FiguraGeometrica[] figuras = {
            new Quadrado(4.0),
            new Retangulo(5.0, 3.0),
            new Circulo(2.5)
        };

        for (FiguraGeometrica figura : figuras) {
            System.out.printf("%s -> Área: %.2f%n",
                figura.getClass().getSimpleName(),
                figura.calcularArea());
        }
    }
}