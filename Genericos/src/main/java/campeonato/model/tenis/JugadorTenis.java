package campeonato.model.tenis;

import campeonato.model.base.ParticipanteAbscracto;

import java.util.Objects;

public class JugadorTenis extends ParticipanteAbscracto {

    private int puntosTotales;

    public JugadorTenis(){
        super();
        this.puntosTotales = 0;
    }

    public JugadorTenis(String nombre) {
        super(nombre);
        this.puntosTotales = 0;
    }

    public int getPuntosTotales() {
        return puntosTotales;
    }

    public void setPuntosTotales(int puntosTotales) {
        this.puntosTotales = puntosTotales;
    }

    @Override
    public String toString() {
        return "JugadorTenis{" +
                "puntosTotales=" + puntosTotales +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        JugadorTenis that = (JugadorTenis) o;
        return puntosTotales == that.puntosTotales;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), puntosTotales);
    }

}
