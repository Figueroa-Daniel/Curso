package cartas;

public class App {
    public static void main(String[] args) {
        Cerbero c1 = new Cerbero("Cerbero", 10, 5, 100);
        Cerbero c2 = new Cerbero("Cerbero", 10, 5, 100);
        Kraken k1 = new Kraken("Kraken", 10, 5, 100);

        System.out.println(c2.defender(k1.atacar()));
        System.out.println(c2.getVida());
        System.out.println(c2.defender(k1.atacar()));
        System.out.println(c2.getVida());

    }
}
