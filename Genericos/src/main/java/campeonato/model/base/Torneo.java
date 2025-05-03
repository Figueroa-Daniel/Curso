package campeonato.model.base;

import java.util.Objects;
import java.util.SortedSet

import java.util.List;
import java.util.TreeSet;

public class Torneo <T extends ParticipanteAbscracto> {
    private List<T> participantes;
    private SortedSet<Ronda<T>> rondas;

    public Torneo() {
        rondas = new TreeSet<>();
    }

    public Torneo(List<T> participantes) {
        this();
        this.participantes = participantes;
    }

    public List<T> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<T> participantes) {
        this.participantes = participantes;
    }

    public SortedSet<Ronda<T>> getRondas() {
        return rondas;
    }

    public void setRondas(SortedSet<Ronda<T>> rondas) {
        this.rondas = rondas;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Torneo<?> torneo = (Torneo<?>) o;
        return Objects.equals(participantes, torneo.participantes) && Objects.equals(rondas, torneo.rondas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(participantes, rondas);
    }

    private void mostrarRonda(Ronda<T> ronda) {
        System.out.println("Ronda " + ronda.getNumero() + ": " + ronda.getTitulo().toUpperCase());
        System.out.println("Partidos:");
        for (Partido<T> partido : ronda.getPartidos()) {
            System.out.println(" - " + partido.getParticipante1().getNombre() + " vs " + partido.getParticipante2().getNombre());
            if (partido.getGanador() != null) {
                System.out.println("   Ganador: " + partido.getGanador().getNombre());
            }
        }
    }
    private void mostrarDatosUltimaRonda () {
        if (!rondas.isEmpty()) {
            mostrarRonda(rondas.last());
        } else {
            System.out.println("No hay rondas disponibles.");
        }

        }private void mostrarDatosTodasRondas () {
            if (!rondas.isEmpty()) {
                for (Ronda<T> ronda : rondas) {
                    mostrarRonda(ronda);
                }
            } else {
                System.out.println("No hay rondas disponibles.");
            }

        }


        @Override
        public String toString () {
            return "Torneo{" +
                    "participantes=" + participantes +
                    ", rondas=" + rondas +
                    '}';
        }
}