package Inmobiliaria;

public class App {
    public static void main(String[] args) {
        Local local = new Local(1, "Calle Falsa 123", 100000, 100, true);
        System.out.println(local);
        Casa c1 = new Casa();
        c1.setIdentificador(2);
        c1.setDireccion("Calle Falsa 124");
        c1.setPrecio(200000);
        c1.setSuperficie(200);
        c1.setNumHabitaciones(3);
        c1.setNumBanos(2);
        System.out.println(c1);
    }
}
