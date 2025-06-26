package ApiStreams.operacionesIntermedias;

import java.util.List;

public class Map {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Amancio", "Diana", "Eve", "Frank", "Grace", "Hannah", "Ian", "Jack");
        names.stream().map(String::length).forEach(System.out::println);
        // Ahora probaremos con objetos
        List<Product> products = List.of(
            new Product("Laptop", 1200.00),
            new Product("Smartphone", 800.00),
            new Product("Tablet", 500.00),
            new Product("Smartwatch", 300.00),
            new Product("Headphones", 150.00),
            new Product("Monitor", 400.00),
            new Product("Keyboard", 100.00)
        );
        products.stream()
                .map(product -> product.getPrice())
                .filter(price -> price > 300.00)
                .forEach(System.out::println);
    }
}
