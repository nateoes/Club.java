import java.util.Arrays;

public class Campeonato {
    Judoka[] lista;
    int llave,key;

    public Campeonato(int llave, Judoka[] lista) {
        this.lista = lista;
        this.llave = llave;
    }

    public Judoka[] getLista() {
        return lista;
    }

    public void setLista(Judoka[] lista) {
        this.lista = lista;
    }

    public int getLlave() {
        return llave;
    }

    public void setLlave(int llave) {
        this.llave = llave;
    }

    @Override
    public String toString() {
        return "Campeonato{" +
                "lista=" + Arrays.toString(lista) +
                ", llave=" + llave +
                '}';
    }
}
