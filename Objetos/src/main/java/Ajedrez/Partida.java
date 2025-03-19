package Ajedrez;

public interface Partida {
   default String terminóPartida(Xogador miembro) {
       return miembro.getNombre() + " terminó la partida.";
   }
   default String terminóPartida(Arbitros miembro) {
       return miembro.getNombre() + " terminó la partida.";
   }
   static int contarPartidas(Xogador miembro) {
       return 1;
   }

}
