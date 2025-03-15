package cartas;

public class Cerbero extends Criaturas{


    public Cerbero(String nome, int ataque, int defesa, int vida) {
        super(nome, ataque, defesa, vida, Habilidades.FUEGO);
    }
    //Se debe retornar la misma criatura que ataca
    @Override
    public Criaturas atacar() {
        return this;
    }
    //En este metodo se debe pasar el ataque del oponente menos la defensa de la criatura
    @Override
    public int defender(Criaturas atacante) {
        // Si el atacante tiene habilidad AGUA, muere directamente
        if (atacante.getHabilidad() == Habilidades.AGUA) {
            this.setVida(0);
            return 10;
        } else {
            // El daño recibido es la diferencia entre el ataque y la defensa
            int dano = atacante.getAtaque() - this.getDefesa();

            // Si el daño es positivo, se resta a la vida actual
            if (dano > 0) {
                this.setVida(this.getVida() - dano);

                // Verifica si el personaje aún sigue vivo después del ataque
                if (this.getVida() <= 0) {
                    this.setVida(0); // evita vida negativa
                    return 10;       // Personaje derrotado
                }
            }
            // Si no hubo daño o sobrevivió, devuelve 0
            return 0;
        }
    }
}
