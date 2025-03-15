package cartas;

public abstract class Criaturas {
    private String nome;
    private int ataque;
    private int defesa;
    private int vida;
    private Habilidades habilidad;
    private boolean vivo = true;

    public Criaturas(String nome, int ataque, int defesa, int vida, Habilidades habilidad) {
        this.nome = nome;
        this.ataque = ataque;
        this.defesa = defesa;
        this.vida = vida;
        this.habilidad= habilidad;
    }

    public String getNome() {
        return nome;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public int getVida() {
        return vida;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public abstract Criaturas atacar();

    public abstract int defender(Criaturas atacante);

    public boolean estaVivo() {
        return this.vida > 0;
    }
    public Habilidades getHabilidad() {
        return habilidad;
    }

    @Override
    public String toString() {
        return "Criaturas{" +
                "nome='" + nome + '\'' +
                ", ataque=" + ataque +
                ", defesa=" + defesa +
                ", vida=" + vida +
                '}';
    }


}
