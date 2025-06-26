package ApiStreams.operacionesTenerminales;

import java.util.List;

public class Match {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Amancio", "Diana", "Eve", "Frank", "Grace", "Hannah", "Ian", "Jack");
        boolean result = names.stream().anyMatch(text -> text.startsWith("z"));
        System.out.println(result);
        boolean result2 = names.stream().allMatch(text -> text.startsWith("z"));
        System.out.println(result2);
        boolean result3 = names.stream().noneMatch(text -> text.startsWith("z"));
        System.out.println(result3);


    }
}
