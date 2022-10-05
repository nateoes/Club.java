import java.util.Arrays;

public class Club {
    String nombre;
    Judoka[] plantilla;
    String direccion;

    public Club(String nombre, Judoka[] plantilla, String direccion) {
        this.nombre = nombre;
        this.plantilla = plantilla;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Judoka[] getPlantilla() {
        return plantilla;
    }

    public void setPlantilla(Judoka[] plantilla) {
        this.plantilla = plantilla;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Club{" +
                "nombre='" + nombre + '\'' +
                ", plantilla=" + Arrays.toString(plantilla) +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
