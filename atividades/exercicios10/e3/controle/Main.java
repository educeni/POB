/* Exercício 3: Exceção Customizada Verificada (SaldoInsuficienteException)
Enunciado: Crie uma classe de exceção personalizada chamada SaldoInsuficienteException que herde de Exception (Checked Exception). 
Em seguida, crie uma classe ContaCorrente com os atributos numero (String) e saldo (double). O método sacar(double valor) 
deve lançar a exceção (throws SaldoInsuficienteException) caso o valor solicitado seja superior ao saldo disponível. No método main, 
realize saques dentro de um bloco try-catch capturando e exibindo a mensagem de erro.
Conceitos: Criação de Checked Exceptions (extends Exception), cláusulas throw e throws, e propagação de erros de domínio.*/

package atividades.exercicios10.e3;

import java.util.InputMismatchException;
import java.util.Scanner;
import atividades.exercicios10.e3.dominio.ContaCorrente;
import atividades.exercicios10.e3.controle.SaldoInsuficienteException;

public class Main {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        ContaCorrente cC = new ContaCorrente("1234", 3000.0);

        try{
            System.out.print("Forneca o valor para sacar: ");
            double valor = sc.nextDouble();
            cC.sacar(valor);


        }catch(SaldoInsuficienteException e){

            System.out.print("Erro: " + e.getMessage());
        }finally{
            sc.close();
        }

    }
}