package campeonato.dummy;

import campeonato.model.base.ParticipanteAbscracto;
import campeonato.model.base.Ronda;
import campeonato.model.padel.ParejaPadel;
import campeonato.model.tenis.JugadorTenis;

import java.util.ArrayList;
import java.util.List;

public interface DummyData {
    static List<JugadorTenis> generarJugadoresTenis() {
        List<JugadorTenis> jugadores = new ArrayList<>();
        jugadores.add(new JugadorTenis("Roger Federer"));
        jugadores.add(new JugadorTenis("Rafael Nadal"));
        jugadores.add(new JugadorTenis("Novak Djokovic"));
        jugadores.add(new JugadorTenis("Andy Murray"));
        jugadores.add(new JugadorTenis("Pete Sampras"));
        jugadores.add(new JugadorTenis("Andre Agassi"));
        jugadores.add(new JugadorTenis("Boris Becker"));
        jugadores.add(new JugadorTenis("Stefan Edberg"));
        jugadores.add(new JugadorTenis("John McEnroe"));
        jugadores.add(new JugadorTenis("Jimmy Connors"));
        jugadores.add(new JugadorTenis("Ivan Lendl"));
        jugadores.add(new JugadorTenis("Goran Ivanisevic"));
        jugadores.add(new JugadorTenis("Marat Safin"));
        jugadores.add(new JugadorTenis("Lleyton Hewitt"));
        jugadores.add(new JugadorTenis("David Nalbandian"));
        jugadores.add(new JugadorTenis("Juan Carlos Ferrero"));
        jugadores.add(new JugadorTenis("Carlos Moya"));
        jugadores.add(new JugadorTenis("Thomas Muster"));
        jugadores.add(new JugadorTenis("Michael Chang"));
        jugadores.add(new JugadorTenis("Jim Courier"));
        jugadores.add(new JugadorTenis("Milos Raonic"));
        return jugadores;
    }
    static List<ParejaPadel> generarParejasPadel() {
        List<ParejaPadel> parejas = new ArrayList<>();
        parejas.add(new ParejaPadel("Pareja 1", "Jugador 1A", "Jugador 1B"));
        parejas.add(new ParejaPadel("Pareja 2", "Jugador 2A", "Jugador 2B"));
        parejas.add(new ParejaPadel("Pareja 3", "Jugador 3A", "Jugador 3B"));
        parejas.add(new ParejaPadel("Pareja 4", "Jugador 4A", "Jugador 4B"));
        parejas.add(new ParejaPadel("Pareja 5", "Jugador 5A", "Jugador 5B"));
        parejas.add(new ParejaPadel("Pareja 6", "Jugador 6A", "Jugador 6B"));
        parejas.add(new ParejaPadel("Pareja 7", "Jugador 7A", "Jugador 7B"));
        parejas.add(new ParejaPadel("Pareja 8", "Jugador 8A", "Jugador 8B"));
        parejas.add(new ParejaPadel("Pareja 9", "Jugador 9A", "Jugador 9B"));
        parejas.add(new ParejaPadel("Pareja 10", "Jugador 10A", "Jugador 10B"));
        parejas.add(new ParejaPadel("Pareja 11", "Jugador 11A", "Jugador 11B"));
        parejas.add(new ParejaPadel("Pareja 12", "Jugador 12A", "Jugador 12B"));
        parejas.add(new ParejaPadel("Pareja 13", "Jugador 13A", "Jugador 13B"));
        parejas.add(new ParejaPadel("Pareja 14", "Jugador 14A", "Jugador 14B"));
        return parejas;
    }
    static <T extends ParticipanteAbscracto> void establecerDatosRonda(Ronda<T> ronda){
        UtilsPartidos.simularPartidos(ronda.getPartidos());
    }
}

