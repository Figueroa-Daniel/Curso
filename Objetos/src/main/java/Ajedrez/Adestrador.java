package Ajedrez;

public class Adestrador extends Miembro{
    private int anosExperiencia;
    private String titulacion;

    public Adestrador(String dni, String nombre, String apellidos, int anosExperiencia, String titulacion) {
        super(dni, nombre, apellidos);
        this.anosExperiencia = anosExperiencia;
        this.titulacion = titulacion;
    }

    @Override
    public String aCadea() {
        return "Adestrador{" +
                "dni='" + getDni() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", apellidos='" + getApellidos() + '\'' +
                ", anosExperiencia=" + anosExperiencia +
                ", titulacion='" + titulacion + '\'' +
                '}';
    }
}
