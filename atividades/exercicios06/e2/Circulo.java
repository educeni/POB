/* Exercício 2: Classe Circulo e Métodos com Retorno de Valor
Enunciado: Crie uma classe Circulo que possua o atributo raio (double). Defina dois métodos com retorno:
calcularArea(): retorna pi * raio^2 (use Math.PI e Math.pow()).
calcularPerimetro(): retorna 2 * pi * raio.
Na classe Main, leia o valor do raio digitado pelo usuário, instancie o círculo e exiba a área e o perímetro calculados com duas casas decimais.
Conceitos: Métodos com tipo de retorno (double), uso da classe utilitária Math e passagem de estado interno. */

package atividades.exercicios06.e2;

import java.util.Scanner;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio; 
    }

    public double getRaio() {
        return raio;
    }

    // SETTER: Permite alterar o raio depois de criado, podendo adicionar regras.
    public void setRaio(double raio) {
        if (raio > 0) {
            this.raio = raio;
        } else {
            System.out.println("Erro: O raio deve ser maior que zero!");
        }
    }

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularPerimetro(){
        return Math.PI * 2 * raio;
    }

}