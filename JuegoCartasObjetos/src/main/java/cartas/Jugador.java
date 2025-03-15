package cartas;

public class Jugador {
    private String nombre;
    private int VidaPlayer;

    public Jugador(String nombre, int VidaPlayer) {
        this.nombre = nombre;
        this.VidaPlayer = VidaPlayer;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVidaPlayer() {
        return VidaPlayer;
    }

    public void setVidaPlayer(int vidaPlayer) {
        VidaPlayer = vidaPlayer;
    }
}
