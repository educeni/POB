package atividades.CADASTRO_PESSOAS;

import atividades.CADASTRO_PESSOAS.controller.controlaPessoa;
import atividades.CADASTRO_PESSOAS.view.PessoaView;

public class Main {
    public static void main(String[] args) {
        controlaPessoa controller = new controlaPessoa();
        PessoaView view = new PessoaView(controller);
        view.exibirMenu();
    }
}
