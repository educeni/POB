package atividades.exercicios12.e4.controle;

import atividades.exercicios12.e4.dominio.*;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> nomes = Arrays.asList(
            "ana",
            "carlos",
            "beatriz",
            "antonio",
            "amanda"
        );


        // 1. Inverter as Strings
        List<String> invertidos =
            ProcessadorTexto.processarLista(
                nomes,
                texto -> new StringBuilder(texto)
                    .reverse()
                    .toString()
            );

        System.out.println("Nomes invertidos:");
        System.out.println(invertidos);


        // 2. Colocar os textos entre colchetes
        List<String> colchetes =
            ProcessadorTexto.processarLista(
                nomes,
                texto -> "[" + texto + "]"
            );

        System.out.println("\nNomes entre colchetes:");
        System.out.println(colchetes);


        // 3. Transformar em letras maiúsculas
        List<String> maiusculas =
            ProcessadorTexto.processarLista(
                nomes,
                String::toUpperCase
            );

        System.out.println("\nNomes em maiúsculas:");
        System.out.println(maiusculas);

    }
}