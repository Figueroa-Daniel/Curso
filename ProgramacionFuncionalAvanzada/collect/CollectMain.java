package ProgramacionFuncionalAvanzada.collect;

import ProgramacionFuncionalAvanzada.Developer;
import ProgramacionFuncionalAvanzada.Product;
import ProgramacionFuncionalAvanzada.Task;

import java.util.*;
import java.util.stream.Collectors;

public class CollectMain {
    public static void main(String[] args) {
        //String sku, String name, Double price, boolean discount
        List<Product> products = new ArrayList<>(
                List.of(
                        new Product("sku1", "Product 1", 100.0, false),
                        new Product("sku2", "Product 2", 200.0, true),
                        new Product("sku3", "Product 3", 300.0, false),
                        new Product("sku4", "Product 4", 400.0, true),
                        new Product("sku5", "Product 5", 500.0, false)
                )
        );
        Set<Product> productSet = products.stream()
                .filter(product -> product.getPrice()>300.0)
                .collect(Collectors.toSet());
        //concatenar los nombres de los productos en un String
        String productNames = products.stream()
                .filter( product -> product.getPrice()> 300.0)
                .map(Product::getName)
                .collect(Collectors.joining(", "));
        System.out.println(productNames);

        DoubleSummaryStatistics stats = products.stream().collect(Collectors.summarizingDouble(Product::getPrice));
        System.out.println("Total de productos: " + stats.getCount());
        System.out.println("Precio mínimo: " + stats.getMin());
        System.out.println("Precio máximo: " + stats.getMax());
        System.out.println("Precio promedio: " + stats.getAverage());
        System.out.println("Suma total de precios: " + stats.getSum());

        List<Developer> devs = getDevelopers();
        Map<Integer, List<Developer>> developersGroupList = devs.stream().collect(Collectors.groupingBy(Developer::getAge));
        System.out.println("Desarrolladores agrupados por edad: " + developersGroupList);

        products.stream().mapToDouble(Product::getPrice).average().ifPresent(System.out::println);
        // podrias usar un orElse para poner un valor por defecto si no hay elementos


    }
    private static List<Developer> getDevelopers(){
        Task task1 = new Task(1L, "Description 1", 5);
        Task task2 = new Task(2L, "Description 2", 3);
        Task task3 = new Task(3L, "Description 3", 8);
        Developer dev1 = new Developer("Alice", 30, List.of(task1, task2));
        Task task4 = new Task(4L, "Description 4", 5);
        Task task5 = new Task(5L, "Description 5", 3);
        Task task6 = new Task(6L, "Description 6", 8);
        Developer dev2 = new Developer("Bob", 25, List.of(task1, task2, task3));
        Task task7 = new Task(7L, "Description 7", 5);
        Task task8 = new Task(8L, "Description 8", 3);
        Developer dev3 = new Developer("Charlie", 30, List.of(task4, task5, task6));
        Task task9 = new Task(9L, "Description 9", 5);
        Task task10 = new Task(10L, "Description 10", 3);
        Developer dev4 = new Developer("David", 35, List.of(task7, task8, task9, task10));
        return List.of(dev1, dev2, dev3, dev4);


    }
}
