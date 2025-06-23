package ApiStreams.creation;

import java.util.Arrays;

public class StreamsArrays {
    public static void main(String[] args) {
        int[]numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        long numElements = Arrays.stream(numbers).count();
        long sum = Arrays.stream(numbers).sum();
        System.out.println("Total de elementos: " + numElements);
        System.out.println("Suma de elementos: " + sum);
    }
}
