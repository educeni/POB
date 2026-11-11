package atividades.exercicios09.e2.controle;
import atividades.exercicios09.e2.dominio.*;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias de Retangulo e Circulo
        Retangulo retangulo = new Retangulo("Azul", 5.0, 3.0);
        Circulo circulo = new Circulo("Vermelho", 2.0);

        // Exibindo a cor e a área do retângulo
        retangulo.exibirCor();
        System.out.println("Área do retângulo: " + retangulo.calcularArea());

        // Exibindo a cor e a área do círculo
        circulo.exibirCor();
        System.out.println("Área do círculo: " + circulo.calcularArea());
    }
}
