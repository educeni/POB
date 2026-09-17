package atividades.exercicios07.e1.controle;

import atividades.exercicios07.e1.dominio.Produto;

public class ControlaProduto{
   public static void main(String[] args){
       Produto a = new Produto("Esmalte", 15.30, 3);
       Produto b = new Produto("Bola", 79.99);
      
       System.out.println("Nome do produto A: " + a.getNome());
       System.out.println("Preco do produto A: " + a.getPreco());
       System.out.println("Quantidade no estoque do produto A: " + a.getQuantidadeEstoque());
       System.out.println("Nome do produto B: " + b.getNome());
       System.out.println("Preco do produto B: " + b.getPreco());
       System.out.println("Quantidade no estoque do produto B: " + b.getQuantidadeEstoque());

       a.setPreco(-10.0);
       System.out.println("Tentando settar o preco de A como negativo: " + a.getPreco());

       System.out.println("Valor total em estoque do produto " + a.getNome() + ":" + a.calcularValorTotalEmEstoque());
       System.out.println("Valor total em estoque do produto " + b.getNome() + ":" + b.calcularValorTotalEmEstoque());
   }
}
