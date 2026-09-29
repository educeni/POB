/* Exercício 4: Validação de Idade com Exceção Não Verificada (IdadeInvalidaException)
Enunciado: Crie uma exceção personalizada IdadeInvalidaException herdando de RuntimeException (Unchecked Exception). Crie uma classe Eleitor com o método 
cadastrar(String nome, int idade). Se a idade informada for menor que 0 ou maior que 130, lance a exceção imediatamente com uma mensagem descritiva. 
Na classe de teste, tente cadastrar eleitores com idades válidas e inválidas, tratando a exceção em tempo de execução.
Conceitos: Criação de Unchecked Exceptions (extends RuntimeException), validação de invariantes de estado e diferença de obrigatoriedade de declaração de throws.*/

package atividades.exercicios10.e4.controle;

import java.util.InputMismatchException;
import atividades.exercicios10.e4.dominio.*;

public class IdadeInvalidaException extends RuntimeException{
    public IdadeInvalidaException(String mensagem) {
        super(mensagem);
    }
}