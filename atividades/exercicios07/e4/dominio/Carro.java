/* Exercício 4: Classe Carro com Atributo de Leitura Derivada
Enunciado: Crie uma classe Carro com os atributos privados: modelo (String), ano (int) e velocidadeAtual (int, iniciando em 0). Implemente:
Construtor que receba modelo e ano.
Métodos getters para todos os atributos, mas setters apenas para modelo.
Métodos operacionais acelerar(int incremento) e frear(int decremento). A velocidade nunca pode ficar abaixo de 0 km/h.
Um método booleano de consulta/leitura isEmMovimento() que retorne true se velocidadeAtual > 0 e false caso contrário.
Conceitos: Métodos getters do tipo booleano (is...), 
encapsulamento de comportamento de transição de estado e bloqueio de acesso de escrita externo a variáveis dinâmicas.*/

package atividades.exercicios07.e4.controle;

public class Carro {
    private String modelo;
    private int ano;
    private int velocidadeAtual;

    //Construtor
    public Carro(String modelo, int ano){
        setModelo(modelo);
        this.ano = ano;
        this.velocidadeAtual = 0;
    }

    //Getters
    public String getModelo(){
        return this.modelo;
    }

    public int getAno(){
        return this.ano;
    }

    public int getVelocidadeAtual(){
        return this.velocidadeAtual;
    }

    //Setters
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    //Metodos
    public void acelerar(int incremento){
        if(incremento>=0){
            this.velocidadeAtual += incremento;
        }
    }

    public void frear(int decremento){
        if(this.velocidadeAtual>=decremento)
        {
            this.velocidadeAtual -= decremento;
        }
        else
            this.velocidadeAtual = 0;
    }

    public boolean isEmMovimento(){
        if(this.velocidadeAtual > 0)
        {
            return true;
        }
        else
            return false;
    }
}