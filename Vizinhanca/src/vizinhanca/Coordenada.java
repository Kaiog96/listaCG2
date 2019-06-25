
package vizinhanca;


public class Coordenada {

    private final int x;
    private final int y;

    public Coordenada(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Coordenada clonar() {
        return new Coordenada(x, y);
    }

    public static Coordenada getFromString(String coordenada) {
        String[] valores = coordenada.split(";");
        return new Coordenada(Integer.parseInt(valores[0]), Integer.parseInt(valores[1]));
    }

}
