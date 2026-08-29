/* Enunciado: Desenvolva um programa que receba o valor da hora de trabalho de um funcionário e a quantidade de horas trabalhadas no 
mês. O programa deve calcular o salário bruto, descontar uma taxa fixa de 10% referente ao INSS e exibir o salário líquido final.
Conceitos: Multiplicação, cálculo percentual e variáveis intermediárias.
Exemplo de Entrada: Valor da hora: 50.00, Horas: 160  Saída esperada: Salário Bruto: R$ 8000.00, Salário Líquido: R$ 7200.00
*/

package atividades.exercicios01;

import java.util.Scanner;
import java.text.DecimalFormat;

public class SalarioFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.print("Forneca o valor da hora de trabalho: ");
        double valorHora = sc.nextDouble();

        System.out.print("Forneca a quantidade de horas de trabalho: ");
        int horasTotais = sc.nextInt();

        double salarioBruto = valorHora*horasTotais;
        double salarioLiquido = salarioBruto*0.9;

        System.out.println("Salário Bruto: R$ " + df.format(salarioBruto) + "Salário Líquido: R$ " + df.format(salarioLiquido));

    }
}
