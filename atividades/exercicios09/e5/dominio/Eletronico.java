package atividades.exercicios09.e5.dominio;

public class Eletronico extends Item implements Tributavel {

    public Eletronico(int codigo, double precoBase) {
        super(codigo, precoBase); // Passa os dados para a classe Item
    }

    @Override 
    public double calcularTributo(){
        return getPrecoBase() * 0.15;
    }
}
