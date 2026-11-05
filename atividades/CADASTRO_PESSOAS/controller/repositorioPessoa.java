package atividades.CADASTRO_PESSOAS.controller;

import atividades.CADASTRO_PESSOAS.model.Pessoas;
import atividades.CADASTRO_PESSOAS.view.*;
import java.util.ArrayList;
import java.io.*;

public class repositorioPessoa{
    private final String arquivoPessoas = "pessoas.txt";

    public void salvarPessoa(ArrayList<Pessoa> pessoas){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoProdutos))) {
            for(Pessoa pessoa: pessoas)  {
                writer.write(pessoa.toFileString);
                writer.newLine();
            }
        }
        catch (IOException e){
            System.out.println("Erro ao salvar pessoas: " + e.getMessage());
        }
    }

    public ArrayList<Pessoa> carregarPessoas() {
        // Cria uma nova lista para armazenar os produtos lidos do arquivo
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        // Usa try-with-resources para garantir o fechamento automático do BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivoPessoas))) {
            String linha;
            // Lê o arquivo linha por linha até o final (null)
            while ((linha = reader.readLine()) != null) {
                // Converte cada linha em um objeto Produto e adiciona à lista
                pessoas.add(pessoas.fromFileString(linha));
            }
        } catch (FileNotFoundException e) {
            // Caso o arquivo ainda não exista, exibe uma mensagem amigável (não trata como erro grave)
            System.out.println("Arquivo de produtos não encontrado. Será criado ao salvar novos produtos.");
        } catch (IOException e) {
            // Captura e exibe outros erros de entrada/saída
            System.out.println("Erro ao carregar produtos: " + e.getMessage());
        }
        // Retorna a lista de produtos carregados (pode estar vazia, se o arquivo não existir)
        return pessoas;
    }
}
