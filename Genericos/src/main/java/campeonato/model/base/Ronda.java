package campeonato.model.base;

import java.util.List;

public class Ronda <T extends ParticipanteAbscracto> implements Comparable<Ronda<T>>{
    private int numero;
    private String titulo;
    private List<Partido<T>> partidos;
    private boolean esFinal;
    private boolean terminada;
    private List<T> ganadores;

    public Ronda(String titulo, int numero, boolean esFinal, List<Partido<T>> partidos, boolean terminada, List<T> ganadores) {
        this.titulo = titulo;
        this.numero = numero;
        this.esFinal = esFinal;
        this.partidos = partidos;
        this.terminada = terminada;
        this.ganadores = ganadores;
    }

    public boolean isEsFinal() {
        return esFinal;
    }

    public void setEsFinal(boolean esFinal) {
        this.esFinal = esFinal;
    }

    public List<Partido<T>> getPartidos() {
        return partidos;
    }

    public void setPartidos(List<Partido<T>> partidos) {
        this.partidos = partidos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public int compareTo(Ronda<T> o) {
        return Integer.compare(this.numero, o.numero);
    }
    public boolean terminarRonda(){
        this.terminada = true;
        for(Partido<T> partido : partidos){
            this.terminada &= partido.getGanador() != null;
        }
        if(this.terminada){
            extraerGanadores();
        }
    }

    private void extraerGanadores() {
        for (Partido<T> partido : partidos) {
            if (partido.getGanador() != null) {
                ganadores.add(partido.getGanador());
            }
        }
    }

    public List<T> getGanadores() {
        if (this.terminada){
            return ganadores;
        } else {
            throw new IllegalStateException("La ronda no ha terminado");
        }
    }

    public boolean isTerminada(){
        return this.isTerminada();
    }
}
