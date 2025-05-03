package campeonato.model.base;

import java.util.Objects;

public abstract class ParticipanteAbscracto {
    protected String nombre;
    public ParticipanteAbscracto(String nombre) {
        this.nombre = nombre;
    }
    public ParticipanteAbscracto () {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ParticipanteAbscracto that = (ParticipanteAbscracto) o;
        return Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }

    @Override
    public String toString() {
        return "ParticipanteAbscracto{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
