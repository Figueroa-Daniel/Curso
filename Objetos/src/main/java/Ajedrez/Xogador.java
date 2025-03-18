package Ajedrez;

public class Xogador extends Miembro{


    private Categoria categoria;
    private String[] torneosGanados = new String[10];
    private int elo;
    private boolean federado;

    public Xogador(String dni, String nombre, String apellidos, Categoria categoria, int elo, boolean federado) {
        super(dni, nombre, apellidos);
        this.categoria = categoria;
        setElo(elo);
        this.federado = federado;
    }

    public void setElo(int elo) {
        if(this.categoria == Categoria.PRINCIPIANTE && elo < 1500) {
            this.elo = elo;
        } else if(this.categoria == Categoria.INTERMEDIO && elo >= 1500 && elo < 2000) {
            this.elo = elo;
        } else if(this.categoria == Categoria.AVANZADO && elo >= 2000 && elo < 2200) {
            this.elo = elo;
        } else if(this.categoria == Categoria.MAESTRO && elo >= 2200) {
            this.elo = elo;
        } else {
            System.out.println("Elo incorrecto");
        }
    }

    @Override
    public String aCadea() {
        //es abstracta aCadea en el padre hay que usar los get en vez del super
        return "Xogador{" +
                "dni='" + getDni() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", apellidos='" + getApellidos() + '\'' +
                ", categoria=" + categoria +
                ", elo=" + elo +
                ", federado=" + federado +
                '}';
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String[] getTorneosGanados() {
        //También mostrará los torneos ganados
        for (int i = 0; i < torneosGanados.length; i++) {
            if(torneosGanados[i] != null){
                System.out.println(torneosGanados[i]);
            }
        }
        return torneosGanados;
    }

    public void setTorneosGanados(String[] torneosGanados) {
        this.torneosGanados = torneosGanados;
    }
    public boolean añadirToreneso(String toreno){
        //Si hay hueco en el array lo añade y devuelve true, si no amplia el array y lo añade
        for (int i = 0; i < torneosGanados.length; i++) {
            if(torneosGanados[i] == null){
                torneosGanados[i] = toreno;
                return true;
            }
        }
        String[] torneosGanadosAux = new String[torneosGanados.length + 5];
        for (int i = 0; i < torneosGanados.length; i++) {
            torneosGanadosAux[i] = torneosGanados[i];
        }
        torneosGanadosAux[torneosGanados.length] = toreno;
        torneosGanados = torneosGanadosAux;
        return true;

    }

    public int getElo() {
        return elo;
    }

    public boolean isFederado() {
        return federado;
    }

    public void setFederado(boolean federado) {
        this.federado = federado;
    }
}
