/* Exercício 4: Classe Funcionario com Métodos de Aumento Percentual
Enunciado: Desenvolva uma classe Funcionario com os atributos nome (String), cargo (String) e salarioBruto (double). Adicione os métodos:
aplicarAumento(double porcentagem): ajusta o salarioBruto somando o acréscimo percentual informado.
calcularSalarioLiquido(double descontoImposto): retorna o salário líquido após abater um valor fixo informado por parâmetro.
No método principal, instancie um funcionário, aplique um aumento de 10% e exiba os valores antes e após a alteração.
Conceitos: Mutação de atributos por métodos operacionais e cálculo percentual dentro do domínio do objeto. */

public class Funcionario {
    private String nome;
    private String cargo;
    private double salarioBruto;

    //Construtor
    public Funcionario(String nome, String cargo, double salarioBruto){
        this.nome = nome;
        this.cargo = cargo;
        this.salarioBruto = salarioBruto;
    }

    //Getters
    public String getNome(){
        return nome;
    }

    public String getCargo(){
        return cargo;
    }

    public double getSalarioBruto(){
        return salarioBruto;
    }

    //Setters
    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public void setSalarioBruto(double salarioBruto){
        this.salarioBruto = salarioBruto;
    }

    public void aplicarAumento(double porcentagem){
        salarioBruto = salarioBruto + (salarioBruto*(porcentagem/100));
    }

    public double calcularSalarioLiquido(double descontoImposto){
        return salarioBruto - descontoImposto; 
    }
}