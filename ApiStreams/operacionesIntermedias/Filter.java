package ApiStreams.operacionesIntermedias;

import java.util.*;

public class Filter {
    public static void main(String[] args) {

        List<String> names = List.of("Alice", "Bob", "Amancio", "Diana", "Eve", "Frank", "Grace", "Hannah", "Ian", "Jack");
        names.stream().filter(text -> text.startsWith("A")).forEach(System.out::println); // Filter names that start with "A"
        System.out.println("-------------------");
        names.stream().filter(text -> text.startsWith("A")).filter(text -> text.endsWith("o")).forEach(System.out::println);


    }
}
