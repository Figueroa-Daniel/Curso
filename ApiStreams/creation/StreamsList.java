package ApiStreams.creation;

import java.util.*;
import java.util.ArrayList;

public class StreamsList {
    public static void main(String[] args) {
        List<String> names =  new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Diana");
        names.add("Eve");
        long num = names.stream().count(); // Count the number of elements in the stream
        System.out.println("Number of names: " + num);
    }
}
