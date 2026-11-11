package atividades.exercicios09.e1.controle;

import atividades.exercicios09.e1.dominio.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MetodoPagamento metodoPix = new Pix("213s9aydsu9");

        MetodoPagamento metodoCartao = new CartaoCredito("12387503", 2000.0);


        // pagamento pix
        System.out.print("Forneca o total da compra pix: ");
        double total = sc.nextDouble();

        finalizarCompra(metodoPix, total);

        //pagamento cartao-
        System.out.print("Forneca o total da compra cartao: ");
        double total2 = sc.nextDouble();

        finalizarCompra(metodoCartao, total2);
        sc.close();

    }

    public static void finalizarCompra(MetodoPagamento metodo, double total) {
        System.out.print("Detalhes do pagamento: " + metodo.obterDetalhes()); 

        metodo.processarPagamento(total);

    }


}