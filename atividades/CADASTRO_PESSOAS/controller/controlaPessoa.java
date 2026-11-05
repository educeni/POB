package atividades.CADASTRO_PESSOAS.controller;

import atividades.CADASTRO_PESSOAS.model.Pessoas;
import atividades.CADASTRO_PESSOAS.view.*;
import java.util.ArrayList;


public class controlaPessoa{
    private ArrayList<Pessoa> pessoas;
    private arquivoPessoas repositorioPessoa;


    // contrutor
    public controlaPessoa(){
        this.repositorioPessoa = new repositorioPessoa(); 
        this.repositorioPessoa = repositorioPessoa.carregarPessoas();
    }

    public ArrayList<Pessoa> listarPessoa() {
        return new ArrayList<>(pessoas);

    }

    public void incluirPessoa(int id, String nome, int idade, double altura) {
        Pessoa pessoa = new Pessoas(id, nome, idade, altura);
        pessoas.add(pessoa);
        repositorioPessoa.salvarPessoa(pessoa);
    }

    public boolean excluiPessoa(int id) {
        Pessoa pessoa = buscaPessoaPorId(id);

        if(pessoa!= null) {
            pessoas.remove(pessoa);
            repositorioPessoa.salvarPessoa(pessoa);
            return true;
        }
        else 
            return false;
    }

    public boolean alteraPessoa(int id, String nome, int idade, double altura) {
        Pessoa pessoa = buscaPessoaPorId(id);

        if(pessoa != null) {
            pessoa.setId(id);
            pessoa.setNome(nome);
            pessoa.setIdade(idade);
            pessoa.setAltura(altura); 
            repositorioPessoa.salvarPessoa(pessoa);
            return true;
        }
        else 
            return false;
    }

    private Pessoa buscaPessoaPorId(int id){
        for(Pessoa pessoa : pessoas){
            if(pessoa.getId() == id)
                return pessoa;
        }
        return null;
    }
}
