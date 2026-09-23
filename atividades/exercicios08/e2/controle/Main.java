/* Na classe Main, armazene diferentes funcionários em um vetor do tipo Funcionario[] e percorra o vetor calculando a folha total de forma polimórfica.
Conceitos: Polimorfismo de inclusão, array de referências do tipo da superclasse e ligação dinâmica (dynamic binding).*/

package atividades.exercicios08.e2.controle;

import atividades.exercicios08.e2.dominio.*;

public class Main{
    public static void main(String[] args){
        Funcionario funcionario[] = { new Funcionario("Eduardo", 4000.0),  
                                      new Vendedor("Ana", 3500.0, 20000.0 , 10.0),  
                                      new Gerente("Wilsey", 2000.0, 1000.0)};

        double folhaTotal = 0.0;

        for(int i = 0; i<funcionario.length;i++){
            folhaTotal += funcionario[i].calcularSalario();
            System.out.printf("%s: R$ %.2f%n", funcionario[i].getNome(), funcionario[i].calcularSalario());


        }
        System.out.printf("Folha total: R$ %.2f%n", folhaTotal);

    }
}