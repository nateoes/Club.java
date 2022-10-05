public class Judoka {
    String nombre;
    String Ap_llido_pat;
    String Ap_llido_mate;
    String fecha;
    String genero;
    String categoria;
    float peso_act;

    public Judoka(String nombre, String ap_llido_pat, String ap_llido_mate, String fecha, String genero, String categoria, float peso_act) {
        this.nombre = nombre;
        Ap_llido_pat = ap_llido_pat;
        Ap_llido_mate = ap_llido_mate;
        this.fecha = fecha;
        this.genero = genero;
        this.categoria = categoria;
        this.peso_act = peso_act;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAp_llido_pat() {
        return Ap_llido_pat;
    }

    public void setAp_llido_pat(String ap_llido_pat) {
        Ap_llido_pat = ap_llido_pat;
    }

    public String getAp_llido_mate() {
        return Ap_llido_mate;
    }

    public void setAp_llido_mate(String ap_llido_mate) {
        Ap_llido_mate = ap_llido_mate;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public float getPeso_act() {
        return peso_act;
    }

    public void setPeso_act(float peso_act) {
        this.peso_act = peso_act;
    }

    @Override
    public String toString() {
        return "Judoka{" +
                "nombre='" + nombre + '\'' +
                ", Ap_llido_pat='" + Ap_llido_pat + '\'' +
                ", Ap_llido_mate='" + Ap_llido_mate + '\'' +
                ", fecha='" + fecha + '\'' +
                ", genero='" + genero + '\'' +
                ", categoria='" + categoria + '\'' +
                ", peso_act=" + peso_act +
                '}';
    }
}
