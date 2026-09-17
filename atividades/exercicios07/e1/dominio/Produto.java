/* Exercício 1: Classe Produto com Sobrecarga de Construtores
Enunciado: Crie uma classe Produto encapsulada com os atributos privados: nome (String),
preco (double) e quantidadeEstoque (int). Implemente:
Um construtor completo que inicialize os 3 atributos.
Um construtor sobrecarregado que receba apenas nome e preco, inicializando quantidadeEstoque com 0.
Métodos getters e setters para todos os atributos (com validação no setter do
preço e do estoque para não aceitarem valores negativos).
Um método calcularValorTotalEmEstoque() que retorne preco * quantidadeEstoque.
Conceitos: Modificadores de acesso private/public, palavra-chave this, sobrecarga de construtores (constructor overloading)
e proteção de estado via setters.
Exemplo de Execução: Instanciar Produto A com 3 parâmetros e Produto B com 2 parâmetros; tentar atribuir um preço negativo
via setPreco(-10.0) e validar que o valor não se altera.*/

package atividades.exercicios07.e1.dominio;

public class Produto {
   private String nome;
   private double preco;
   private int quantidadeEstoque;

   //Construtor   
   public Produto(String nome, double preco, int quantidadeEstoque){
       this.nome = nome;
       this.preco = preco;
       this.quantidadeEstoque = quantidadeEstoque;
   }

   public Produto(String nome, double preco){
       this(nome, preco, 0);
   }

   //Getters
   public String getNome(){
       return nome;
   }

   public double getPreco(){
       return preco;
   }

   public int getQuantidadeEstoque(){
       return quantidadeEstoque;
   }

   //Setters
   public void setNome(String nome){
       this.nome = nome;
   }

   public void setPreco(double preco){
       if(preco >= 0){
           this.preco = preco;
       }
   }

   public void setQuantidadeEstoque(int quantidadeEstoque){
       if(quantidadeEstoque>=0) {
           this.quantidadeEstoque = quantidadeEstoque;
       }
   }

   //Metodos
   public double calcularValorTotalEmEstoque(){
       return this.preco * this.quantidadeEstoque;
   }
}