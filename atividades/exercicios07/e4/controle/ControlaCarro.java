package atividades.exercicios07.e4.controle;

import atividades.exercicios07.e4.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro = new Carro("Sedan Computacional", 2024);

        System.out.println("=== DADOS INICIAIS DO CARRO ===");
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Velocidade Inicial: " + carro.getVelocidadeAtual() + " km/h");
        System.out.println("Está em movimento? " + carro.isEmMovimento()); 
        System.out.println("-----------------------------------");

        System.out.println("\n--- Teste 1: Acelerando 50 km/h ---");
        carro.acelerar(50);
        System.out.println("Velocidade Atual: " + carro.getVelocidadeAtual() + " km/h");
        System.out.println("Está em movimento? " + carro.isEmMovimento());             

        System.out.println("\n--- Teste 2: Freando 20 km/h ---");
        carro.frear(20);
        System.out.println("Velocidade Atual: " + carro.getVelocidadeAtual() + " km/h");
        System.out.println("Está em movimento? " + carro.isEmMovimento());            

        System.out.println("\n--- Teste 3: Freando 50 km/h (Estando a 30 km/h) ---");
        carro.frear(50);
        System.out.println("Velocidade Atual: " + carro.getVelocidadeAtual() + " km/h"); 
        System.out.println("Está em movimento? " + carro.isEmMovimento());              

        System.out.println("\n--- Teste 4: Alteração de Modelo ---");
        carro.setModelo("Sedan Computacional Turbo");
        System.out.println("Novo Modelo: " + carro.getModelo());
    }
}