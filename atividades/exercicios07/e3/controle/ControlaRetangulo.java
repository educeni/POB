package atividades.exercicios07.e3.controle;

import atividades.exercicios07.e3.dominio.Retangulo;

public class RetanguloTest01 {
    public static void main(String[] args) {
        System.out.println("=== TESTE 1: Instanciação com valores válidos (5.0 x 3.0) ===");
        Retangulo retanguloValido = new Retangulo(5.0, 3.0);
        
        System.out.println("Altura: " + retanguloValido.getAltura());
        System.out.println("Largura: " + retanguloValido.getLargura());
        System.out.println("Área: " + retanguloValido.calcularArea());         
        System.out.println("Perímetro: " + retanguloValido.calcularPerimetro()); 

        System.out.println("\n=== TESTE 2: Instanciação com valores inválidos (-4.0 x 0.0) ===");
        Retangulo retanguloInvalido = new Retangulo(-4.0, 0.0);
        
        System.out.println("Altura redefinida: " + retanguloInvalido.getAltura());   
        System.out.println("Largura redefinida: " + retanguloInvalido.getLargura());
        System.out.println("Área recalculada: " + retanguloInvalido.calcularArea());
        System.out.println("Perímetro recalculado: " + retanguloInvalido.calcularPerimetro()); 

        System.out.println("\n=== TESTE 3: Alteração via Setters com valor inválido (-10.0) ===");
        Retangulo retanguloAlteracao = new Retangulo(4.0, 2.0);
        System.out.println("Tentando alterar a altura para -10.0:");
        retanguloAlteracao.setAltura(-10.0); // Deve disparar o aviso no console
        
        System.out.println("Nova Altura: " + retanguloAlteracao.getAltura());
        System.out.println("Nova Área: " + retanguloAlteracao.calcularArea());
    }
}