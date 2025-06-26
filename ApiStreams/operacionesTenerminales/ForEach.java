package ApiStreams.operacionesTenerminales;

import ApiStreams.operacionesIntermedias.Product;

import java.util.List;
import java.util.stream.Collectors;

public class ForEach {
    public static void main(String[] args) {
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
        //El toList es una operación terminal que nos permite recolectar los resultados de un Stream en una lista.
        //Esto crea una lista inmutable, por lo que no se puede modificar después de su creación.
        products.stream()
                .forEach(product -> product.setPrice(product.getPrice() * 1.1)); // Aumenta el precio en un 10%
        System.out.println(products);
    }
}
