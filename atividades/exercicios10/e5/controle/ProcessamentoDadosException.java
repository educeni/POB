/* Exercício 5: Encadeamento de Exceções (Exception Chaining) no Processamento de Arquivos Simulado
Enunciado: Crie uma exceção customizada ProcessamentoDadosException (extends Exception). Crie uma classe de serviço com um método processarArquivo(String caminho). 
Dentro do método, simule uma falha de leitura (lançando uma java.io.IOException se o caminho for nulo ou vazio) ou uma falha lógica de parsing. 
Capture a exceção original e relance-a encapsulada dentro da sua ProcessamentoDadosException utilizando o construtor com causa (super(mensagem, causa)). 
No main, exiba tanto a mensagem principal quanto o motivo raiz (getCause().getMessage()).
Conceitos: Encadeamento de exceções (Exception Chaining), preservação do stack trace original e abstração de falhas de baixo nível para camadas superiores de negócio.*/

package atividades.exercicios10.e5.controle;

import java.util.InputMismatchException;
import atividades.exercicios10.e5.dominio;

public class ProcessamentoDadosException extends Exception{
    public ProcessamentoDadosException(String mensagem, Throwable causa){
        super(mensagem, causa);
    }

}