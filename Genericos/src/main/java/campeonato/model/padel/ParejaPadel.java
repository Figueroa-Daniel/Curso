package campeonato.model.padel;

import campeonato.model.base.ParticipanteAbscracto;

import java.util.Objects;

public class ParejaPadel extends ParticipanteAbscracto {
    private String nombreJugador1, nombreJugador2;

    public ParejaPadel(){
        super();
    }
    public ParejaPadel(String nombre) {
        super(nombre);
    }
    public ParejaPadel(String nombre, String nombreJugador1, String nombreJugador2) {
        super(nombre);
        this.nombreJugador1 = nombreJugador1;
        this.nombreJugador2 = nombreJugador2;
    }
    @Override
    public String getNombre () {
        return nombreJugador1 + " y " + nombreJugador2;
    }

    public String getNombreJugador1() {
        return nombreJugador1;
    }

    public void setNombreJugador1(String nombreJugador1) {
        this.nombreJugador1 = nombreJugador1;
    }

    public String getNombreJugador2() {
        return nombreJugador2;
    }

    public void setNombreJugador2(String nombreJugador2) {
        this.nombreJugador2 = nombreJugador2;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ParejaPadel that = (ParejaPadel) o;
        return Objects.equals(nombreJugador1, that.nombreJugador1) && Objects.equals(nombreJugador2, that.nombreJugador2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nombreJugador1, nombreJugador2);
    }

    @Override
    public String toString() {
        return "ParejaPadel{" +
                "nombreJugador1='" + nombreJugador1 + '\'' +
                ", nombreJugador2='" + nombreJugador2 + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
