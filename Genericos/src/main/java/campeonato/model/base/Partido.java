package campeonato.model.base;

import java.util.Objects;

public class Partido<T extends ParticipanteAbscracto>{
    private T participante1;
    private T participante2;
    private T ganador;
    private T perdedor;
    public Partido(){

    }

    public Partido(T participante1, T participante2) {
        this.participante1 = participante1;
        this.participante2 = participante2;
    }

    public Partido(T participante1, T participante2, T ganador, T perdedor) {
        this.participante1 = participante1;
        this.participante2 = participante2;
        this.ganador = ganador;
        this.perdedor = perdedor;
    }

    public T getParticipante1() {
        return participante1;
    }

    public void setParticipante1(T participante1) {
        this.participante1 = participante1;
    }

    public T getParticipante2() {
        return participante2;
    }

    public void setParticipante2(T participante2) {
        this.participante2 = participante2;
    }

    public T getPerdedor() {
        return perdedor;
    }

    public void setPerdedor(T perdedor) {
        this.perdedor = perdedor;
    }

    public T getGanador() {
        return ganador;
    }

    public void setGanador(T ganador) {
        this.ganador = ganador;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Partido<?> partido = (Partido<?>) o;
        return Objects.equals(participante1, partido.participante1) && Objects.equals(participante2, partido.participante2) && Objects.equals(ganador, partido.ganador) && Objects.equals(perdedor, partido.perdedor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(participante1, participante2, ganador, perdedor);
    }

    @Override
    public String toString() {
        return "Partido{" +
                "participante1=" + participante1 +
                ", participante2=" + participante2 +
                ", ganador=" + ganador +
                ", perdedor=" + perdedor +
                '}';
    }


}
