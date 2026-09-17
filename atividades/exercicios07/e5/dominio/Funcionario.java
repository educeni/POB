/* Exercício 5: Classe Funcionario com Regras de Negócio no Setter
Enunciado: Desenvolva uma classe Funcionario com os atributos privados nome (String), matricula (String) e salario (double).
O construtor deve receber todos os 3 atributos.
O setSalario(double novoSalario) só deve permitir alterações se o novoSalario for estritamente maior que o salario atual (uma regra da empresa que impede 
redução salarial arbitrária por atribuição direta). Se for menor ou igual, exiba uma mensagem de erro e não altere o valor.
Implemente um método exibirDados() que imprima todos os dados formatados.
Conceitos: Aplicação prática de encapsulamento para garantir invariantes de regras de negócio complexas nos métodos modificadores. */

package atividades.exercicios07.e5.dominio;

public class Funcionario {
    private String nome;
    private String matricula;
    private double salario;

    //Construtor
    public Funcionario(String nome, String matricula, double salario){
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario; 
    }

    //Getters
    public String getNome(){
        return this.nome;
    }

    public String getMatricula(){
        return this.matricula;
    }   

    public double getSalario(){
        return this.salario;
    }

    //Setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public void setSalario(double novoSalario){
        if(novoSalario>this.salario){
            this.salario = novoSalario;
        }
        else{
            System.out.print("ERRO: Valor do novo salario fornecido eh invalido. \n");
        }
    }

    public void exibirDados(){
        System.out.println("O nome do funcionario eh: " + getNome());
        System.out.println("\nA matricula do funcionario eh: " + getMatricula());
        System.out.printf("\nO salario do funcionario eh: %.2f " + getSalario());
    }

}