/* Exercício 1: Meios de Pagamento com Interface (implements)

Enunciado: Crie uma interface MetodoPagamento contendo os métodos:

void processarPagamento(double valor)
String obterDetalhes()
Implemente duas classes concretas que assinem o contrato: CartaoCredito (com atributos numeroCartao e limite) e Pix (com atributo chavePix). 
Na classe Main, crie um método finalizarCompra(MetodoPagamento metodo, double total) que processe compras utilizando qualquer um dos dois métodos.

Conceitos: Contrato de interface (interface, implements), desacoplamento e polimorfismo via interface.
*/

package atividades.exercicios09.e1.dominio;


public interface MetodoPagamento {

    void processarPagamento(double valor);

    String obterDetalhes();

}