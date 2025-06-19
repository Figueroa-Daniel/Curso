package InterfacesFuncionalesYLambdas.predicate;

import java.util.function.Predicate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Predicate es una interfaz funcional que representa una función que toma un argumento y devuelve un booleano.
        // Se utiliza comúnmente para validar condiciones o filtrar colecciones.
        Predicate<String> validateName = name -> name.length() > 5; // Tiene que devolver un boolean
        System.out.println(validateName.test("Alberto")); // true
        System.out.println(validateName.test("Alan")); // false

        List<String> names = List.of("Alberto", "Alan", "Ana", "Alejandro", "Alicia");
        // Validar nombres con Predicate, esto se podría hacer de forma totalmente funcional
        for( String name : names) {
            if (validateName.test(name)) {
                System.out.println("Nombre válido: " + name);
            } else {
                System.out.println("Nombre inválido: " + name);
            }
        }
        List<String> names2 = java.util.List.of("Alberto", "Alan", "Ana", "Alejandro", "Alicia");
        // Validar nombres con Predicate de forma funcional mostrando ambos casos
        names2.forEach(name -> {
            if (validateName.test(name)) {
                System.out.println("Nombre válido (stream): " + name);
            } else {
                System.out.println("Nombre inválido (stream): " + name);
            }
        });
        // De forma más funcional, usando streams
        names2.stream().filter(validateName)
                .forEach(name -> System.out.println("Nombre válido (stream): " + name));


    }
}
