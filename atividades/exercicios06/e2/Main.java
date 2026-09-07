package atividades.exercicios06.e2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Forneca o raio: ");
        double valorDigitado = sc.nextDouble();

        Circulo circulo1 = new Circulo(valorDigitado);

        double area = circulo1.calcularArea();
        double perimetro = circulo1.calcularPerimetro();

        System.out.printf("Essa e a area do circulo: %.2f \n", area);
        System.out.printf("Esse e o perimetro do circulo: %.2f \n", perimetro);

        sc.close();
    }
}