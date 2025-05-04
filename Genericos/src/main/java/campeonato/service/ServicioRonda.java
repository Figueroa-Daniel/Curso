package campeonato.service;

import campeonato.model.base.ParticipanteAbscracto;
import campeonato.model.base.Partido;
import campeonato.model.base.Ronda;
import campeonato.model.base.Torneo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ServicioRonda<T extends ParticipanteAbscracto> {
    private int rondasJugadas;
    private Torneo<T> torneo;
    private List<T> participantes;
    private List<T> participantesDirectosSiguienteRonda;

    public ServicioRonda(){
        this.rondasJugadas = 0;
    }
    public ServicioRonda(Torneo<T> torneo) {
        this();
        this.torneo = torneo;
        this.participantes = torneo.getParticipantes();
        this.participantesDirectosSiguienteRonda = new ArrayList<>();
    }
    private List<Partido<T>> sorteo(List<T> participantes){
        List<T> copia = new ArrayList<>(participantes);
        Collections.shuffle(copia);
        List <Partido<T>> partidos = new ArrayList<>();
        for (int i = 0; i < copia.size(); i += 2) {
            partidos.add(new Partido<>(copia.get(i), copia.get(i + 1)));
        }
        return partidos;
    }
    private String getNombreRonda(int numRonda,int numParticipantes){
        return switch (numParticipantes){
            case 16 -> "Octavos de final";
            case 8 -> "Cuartos de final";
            case 4 -> "Semifinales";
            case 2 -> "Final";
            default -> "Ronda " + numRonda;
        };
    }
    public Ronda<T> primeraRonda(){
        participantesDirectosSiguienteRonda.clear();
        List <T> copia = new ArrayList<>(participantes);
        Random random = new Random();
        if(copia.size() % 2 != 0){
            int index = random.nextInt(copia.size());
            T elegido = copia.remove(index);
            participantesDirectosSiguienteRonda.add(elegido);
        }
        List<Partido<T>> partidos = sorteo(copia);
        rondasJugadas++;
        //String titulo, int numero, boolean esFinal, List<Partido<T>> partidos
        Ronda<T> ronda = new Ronda<>(getNombreRonda(rondasJugadas, participantes.size()), rondasJugadas, false, partidos);
        torneo.getRondas().add(ronda);
        return ronda;
    }
    public Ronda<T> siguienteRonda(){
        Ronda<T> rondaAnterior = torneo.getRondas().last();
        if(rondaAnterior.isEsFinal() || !rondaAnterior.terminarRonda()){
            return null;
        }
        List <T> participantes = rondaAnterior.getGanadores();
        participantes.addAll(participantesDirectosSiguienteRonda);
        participantesDirectosSiguienteRonda.clear();
        Random random = new Random();
        if(participantes.size() % 2 != 0){
            int index = random.nextInt(participantes.size());
            T elegido = participantes.remove(index);
            participantesDirectosSiguienteRonda.add(elegido);
        }
        List<Partido<T>> partidos = sorteo(participantes);
        rondasJugadas++;
        boolean esFinal = participantes.size() == 2 && participantesDirectosSiguienteRonda.isEmpty();
        Ronda<T> ronda = new Ronda<>(getNombreRonda(rondasJugadas, participantes.size()),rondasJugadas,  esFinal, partidos);
        torneo.getRondas().add(ronda);
        return ronda;
    }
}
