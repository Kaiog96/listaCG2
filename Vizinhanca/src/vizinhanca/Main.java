
package vizinhanca;


public class Main {

   
    public static void main(String[] args) {
        try {
            Imagem img = new Imagem("C:\\Users\\Kaio Garcia\\Pictures\\teste.jpg");
            Vizinhanca vizinhanca = new Vizinhanca(img);
            vizinhanca.calcular4VizinhancaHorVert();
            vizinhanca.gerarImagemSaida("C:\\Users\\Kaio Garcia\\Pictures\\teste.jpg");
            vizinhanca.calcular4VizinhancaDiagonal();
            vizinhanca.gerarImagemSaida("C:\\Users\\Kaio Garcia\\Pictures\\teste.jpgg");
            vizinhanca.calcular8Vizinhanca();
            vizinhanca.gerarImagemSaida("C:\\Users\\Kaio Garcia\\Pictures\\teste.jpg");
        } catch (Exception e) {
            System.err.println("Erro: " + e.toString());
        }
    }

}
