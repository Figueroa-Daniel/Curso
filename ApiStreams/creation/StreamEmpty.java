package ApiStreams.creation;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.stream;
import static java.util.stream.Stream.concat;

public class StreamEmpty {
    public static void main(String[] args) {
        Stream<String> namesStream = Stream.empty();
        List<String> names2 = List.of("Alice", "Bob", "Charlie");
        Stream<String> namesStream2 = names2.stream();
        Stream<String> names = Stream.concat(namesStream, namesStream2);
        names.forEach(System.out::println);
    }
}
