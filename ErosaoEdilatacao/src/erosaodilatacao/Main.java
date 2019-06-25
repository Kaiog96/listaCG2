
package erosaodilatacao;

import vizinhanca.Imagem;


public class Main {

    
    public static void main(String[] args) {
        try {

            Imagem img = new Imagem("C:\\Users\\Kaio Garcia\\Pictures\\teste.jpg");
            int[][] elemEstr = {
                {0, 1, 0},
                {1, 1, 1},
                {0, 1, 0}
            };
            ElementoEstruturante elemento = new ElementoEstruturante(elemEstr);
            OperacaoED operacao = new OperacaoED(img, elemento);
            //operacao.erosao(20);
            //operacao.dilatacao(10);
            operacao.abertura(10);
            //operacao.fechamento(10);
            operacao.gerarImagemSaida("C:\\Users\\Kaio Garcia\\Pictures\\teste.jpg");
        } catch (Exception e) {
            System.err.println("Erro: " + e.toString());
        }
    }

}
