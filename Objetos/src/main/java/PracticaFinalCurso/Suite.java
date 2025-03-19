package PracticaFinalCurso;

import java.util.Objects;

public class Suite extends Habitacion{
    public String nombreDeLaSuite;
    private int numeroDePlazas;
    private String serviciosExtra;
    public Suite(int numero, double precio, String descripcion, String nombreDeLaSuite, int numeroDePlazas, String serviciosExtra) {
        super(numero, Precios.PRECIO_SUITE, descripcion);
        this.nombreDeLaSuite = nombreDeLaSuite;
        this.numeroDePlazas = numeroDePlazas;
        this.serviciosExtra = serviciosExtra;
    }

    public String getNombreDeLaSuite() {
        return nombreDeLaSuite;
    }

    public void setNombreDeLaSuite(String nombreDeLaSuite) {
        this.nombreDeLaSuite = nombreDeLaSuite;
    }

    public int getNumeroDePlazas() {
        return numeroDePlazas;
    }

    public void setNumeroDePlazas(int numeroDePlazas) {
        this.numeroDePlazas = numeroDePlazas;
    }

    public String getServiciosExtra() {
        return serviciosExtra;
    }

    public void setServiciosExtra(String serviciosExtra) {
        this.serviciosExtra = serviciosExtra;
    }

    @Override
    public String toString() {
        return "Suite{" +
                "nombreDeLaSuite='" + nombreDeLaSuite + '\'' +
                ", numeroDePlazas=" + numeroDePlazas +
                ", serviciosExtra='" + serviciosExtra + '\'' +
                ", precio=" + precio +
                ", numero=" + numero +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Suite suite = (Suite) o;
        return numeroDePlazas == suite.numeroDePlazas && Objects.equals(nombreDeLaSuite, suite.nombreDeLaSuite) && Objects.equals(serviciosExtra, suite.serviciosExtra);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nombreDeLaSuite, numeroDePlazas, serviciosExtra);
    }

    public String getNombre() {
        return nombreDeLaSuite;
    }
}
