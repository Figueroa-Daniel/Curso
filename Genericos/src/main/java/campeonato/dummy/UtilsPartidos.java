package campeonato.dummy;

import campeonato.model.base.ParticipanteAbscracto;
import campeonato.model.base.Partido;

import java.util.List;

public interface UtilsPartidos {
    static <T extends ParticipanteAbscracto>Partido<T> simularPartido(Partido<T> partido){
        if(partido.getGanador() == null && partido.getPerdedor() == null){
            int random = (int) (Math.random() * 2);
            if(random == 0){
                partido.setGanador(partido.getParticipante1());
                partido.setPerdedor(partido.getParticipante2());
            }else{
                partido.setGanador(partido.getParticipante2());
                partido.setPerdedor(partido.getParticipante1());
            }
        }
        return partido;
    }
    static <T extends ParticipanteAbscracto>List<Partido<T>> simularPartidos(List<Partido<T>> partidos){
        for(int i=0;i<partidos.size();i++){
            simularPartido(partidos.get(i));
        }
        return partidos;
    }
}
