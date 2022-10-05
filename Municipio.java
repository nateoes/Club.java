import java.util.Arrays;

public class Municipio {
    String nombre;
    Club[] club;

    public Municipio(String nombre, Club[] club) {
        this.nombre = nombre;
        this.club = club;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Club[] getClub() {
        return club;
    }

    public void setClub(Club[] club) {
        this.club = club;
    }

    @Override
    public String toString() {
        return "Municipio{" +
                "nombre='" + nombre + '\'' +
                ", club=" + Arrays.toString(club) +
                '}';
    }
}
