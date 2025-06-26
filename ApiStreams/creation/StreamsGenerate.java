package ApiStreams.creation;

import java.util.UUID;
import java.util.stream.Stream;

public class StreamsGenerate {
    public static void main(String[] args) {
        Stream<String> uuidStream = Stream.generate(() -> UUID.randomUUID().toString());
        uuidStream.limit(10).forEach(System.out::println);

        Stream<Integer> numberGenerator =  Stream.iterate(0, num ->  num + 2);
        numberGenerator.limit(10).forEach(System.out::println);

    }
}
