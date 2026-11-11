package atividades.CADASTRO_PESSOAS.model;

import atividades.CADASTRO_PESSOAS.controller;
import atividades.CADASTRO_PESSOAS.view;

public class Pessoas{
    private int id;
    private String nome;
    private int idade;
    private double altura;

    //construtor 
    public Pessoas(int id, String nome, int idade, double altura){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    //getters
    public int getId(){
        return id;

    }

    public String getNome(){
        return nome;

    }

    public int getIdade(){
        return idade;

    }

    public double getAltura(){
        return altura;

    }

    //setters
    public void setId(int id){
        this.id = id;

    }

    public void setNome(String nome){
        this.nome = nome;

    }

    public void setIdade(int idade){
        this.idade = idade;

    }

    public void setAltura(double altura){
        this.altura = altura;

    }

    public String toFileString() {
        return id + ";" + nome + ";" + idade + ";" + altura;
    }
}
