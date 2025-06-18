package InterfacesFuncionalesYLambdas.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        // Clase anonima: es una forma de implementar una interfaz funcional
        // sin necesidad de crear una clase separada.
        Consumer<String> printer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        printer.accept("Hola mundo");
        // Ahora simplificamos con una lambda
        Consumer<String> printer1 = message -> System.out.println(message);
        Consumer<String> printer2 = message -> System.out.println(message);
        printer2.accept("Hola mundo con lambda");
        Consumer<String> printer12 = printer1.andThen(printer2);
        printer12.accept("Hola mundo con andThen");
        // Podemos usar el método andThen para encadenar múltiples consumidores
        List<String> names = new ArrayList<>();
        names.add("name1");
        names.add("name2");
        names.add("name3");
        names.forEach(name -> System.out.println(name));
        System.out.println("-----------------");
        // También podemos usar el método forEach de la lista para iterar sobre los elementos
        names.forEach(printer1); // 21:30

    }
}
