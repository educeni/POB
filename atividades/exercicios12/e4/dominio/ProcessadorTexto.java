package atividades.exercicios12.e4.dominio;

import java.util.List;
import java.util.ArrayList;

public class ProcessadorTexto {

    public static List<String> processarLista(
        List<String> lista,
        TransformadorTexto regra
    ) {

        List<String> resultado = new ArrayList<>();

        // Percorre a lista e aplica a transformação
        lista.forEach(texto -> {

            String novoTexto = regra.transformar(texto);

            resultado.add(novoTexto);

        });

        return resultado;
    }
}

