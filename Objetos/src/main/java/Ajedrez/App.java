package Ajedrez;

public class App {
    public static void main(String[] args) {
        Arbitros arbitro1 = new Arbitros("12345678Z", "Pepe", "Pérez Matamoros", Arbitros.CategoriaArbitro.NACIONAL, 30,"23/12/1990");
        System.out.println(arbitro1.aCadea());
        System.out.println(arbitro1.terminóPartida(arbitro1));
        Xogador jugador1 = new Xogador("12345678Z", "Juan", "García Pérez", Categoria.MAESTRO, 5000,true);
        System.out.println(jugador1.aCadea());
        //Crear una variable que cuente partidas
        int contador=0;

        for(int i=0;i<5;i++){
            contador=contador+Partida.contarPartidas(jugador1);
        }
        System.out.println(contador);
    }
}
