/* Exercício 2: Folha de Pagamento Polimórfica
Enunciado: Crie uma classe base Funcionario com nome (String) e salarioBase (double), contendo o método calcularSalario(), que retorna apenas o salarioBase. 
Crie duas subclasses:
Gerente: adiciona um bonusFixo (double) e sobrescreve calcularSalario() somando o bônus ao salário base.
Vendedor: adiciona totalVendas (double) e comissaoPercentual (double), sobrescrevendo calcularSalario() para somar a comissão ao salário base.
Na classe Main, armazene diferentes funcionários em um vetor do tipo Funcionario[] e percorra o vetor calculando a folha total de forma polimórfica.
Conceitos: Polimorfismo de inclusão, array de referências do tipo da superclasse e ligação dinâmica (dynamic binding).*/

package atividades.exercicios08.e2.dominio;

public class Funcionario{
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario(){
        return this.salarioBase;
    }

    public String getNome() {
        return nome;
    }
}
