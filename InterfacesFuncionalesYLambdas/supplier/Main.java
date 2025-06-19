package InterfacesFuncionalesYLambdas.supplier;

import java.util.UUID;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // Supplier es una interfaz funcional que no toma argumentos y devuelve un valor. Genera datos
        Supplier<Double> generator = () -> Math.random(); // Supplier es una interfaz funcional que no toma argumentos y devuelve un valor.
        System.out.println("Número aleatorio: " + generator.get()); // Imprime un número aleatorio
        System.out.println("Otro número aleatorio: " + generator.get()); // Imprime otro número aleatorio

        // Generar un id
        Supplier<String> idGenerator = () -> UUID.randomUUID().toString();
        System.out.println("ID generado: " + idGenerator.get()); // Imprime un ID único generado aleatoriamente
        System.out.println("Otro ID generado: " + idGenerator.get()); // Imprime otro ID único generado aleatoriamente

    }
}
