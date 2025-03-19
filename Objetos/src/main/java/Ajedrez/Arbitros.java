package Ajedrez;

public class Arbitros extends Miembro implements Partida{
    public enum CategoriaArbitro {
        AUTONOMICO, NACIONAL, INTERNACIONAL
    }
    private CategoriaArbitro categoria;
    private int numeroTorneos;
    private String fechaUltimoTorneo;

    public Arbitros(String dni, String nombre, String apellidos, CategoriaArbitro categoria, int numeroTorneos, String fechaUltimoTorneo) {
        super(dni, nombre, apellidos);
        this.categoria = categoria;
        this.numeroTorneos = numeroTorneos;
        this.fechaUltimoTorneo = fechaUltimoTorneo;
    }
    public CategoriaArbitro getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaArbitro categoria) {
        this.categoria = categoria;
    }

    public int getNumeroTorneos() {
        return numeroTorneos;
    }

    public void setNumeroTorneos(int numeroTorneos) {
        if(numeroTorneos > 0) {
            this.numeroTorneos = numeroTorneos;
        } else {
            System.out.println("Numero de torneos incorrecto");
        }
    }

    public String getFechaUltimoTorneo() {
        return fechaUltimoTorneo;
    }

    public void setFechaUltimoTorneo(String ultimoTorneo) {
        //comprobar que la fecha esta en formato dd/mm/aaaa
        if(ultimoTorneo.matches("\\d{2}/\\d{2}/\\d{4}")) {
            this.fechaUltimoTorneo = ultimoTorneo;
        } else {
            System.out.println("Fecha incorrecta");
        }
    }

    @Override
    public String aCadea() {
        return "Arbitros{" +
                "dni='" + getDni() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", apellidos='" + getApellidos() + '\'' +
                ", categoria=" + categoria +
                ", numeroTorneos=" + numeroTorneos +
                ", fechaUltimoTorneo='" + fechaUltimoTorneo + '\'' +
                '}';
    }
}
