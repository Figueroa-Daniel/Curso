package ProgramacionFuncionalAvanzada.comparator;

import ProgramacionFuncionalAvanzada.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain {
    public static void main(String[] args) {
        Comparator<Double> comparador1 = (n1,n2) -> n1.compareTo(n2);
        Comparator<Double> comparador2 = Double::compareTo;
        System.out.println(comparador1.compare(50.0, 100.0)); // -1 porque 50 es menor que 100
        System.out.println(comparador1.compare(50.0, 50.0)); // 0 porque son iguales
        System.out.println(comparador2.compare(100.0, 50.0)); // 1 porque 100 es mayor que 50

        Product product1 = new Product("121", "pan", 10.0, false);
        Product product2 = new Product("122", "leche", 20.0, false);
        // Comparator<Product> productComparator = (p1, p2) -> p1.getPrice().compareTo(p2.getPrice()); esto se puede hacer de forma mas sencilla
        Comparator<Product> productComparator = Comparator.comparing(Product::getPrice);
         // -1 porque el precio de pan es menor que el de leche
        System.out.println(productComparator.compare(product1, product2));

        List<Product> products = new ArrayList<>(List.of(
                new Product("123", "huevo", 4.0, false),
                new Product("124", "queso", 15.0, false),
                new Product("125", "jamon", 5.0, false),
                new Product("126", "mantequilla", 30.0, false)
        ));
        // Ordenar productos por precio, pasando el comparator al sort
        products.sort(productComparator);
        System.out.println(products);
        // Tambien se podría usar un reversed
        products.sort(productComparator.reversed());
        // 14:00

    }
}
