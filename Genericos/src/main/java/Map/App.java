package Map;

import java.util.*;

public class App {
    public static void main(String[] args) {
        //El map no hereda de Collection
        //Mas rápido que un set
        Map<Integer,String> map1 = Map.of(1,"uno",2,"dos",3,"tres");
        Map<Integer,String> map2 = Map.ofEntries(
                Map.entry(1,"uno"),
                Map.entry(2,"dos"),
                Map.entry(3,"tres")
        );
        Map <Integer,String> map3 = new HashMap<>();
        map3.put(1,"uno");
        map3.put(2,"dos");
        map3.put(3,"tres");

        System.out.println(map3.get(1));
        System.out.println(map3.getOrDefault(4,"cuatro"));
        System.out.println("------------------");
        for(int num: map3.keySet()){
            System.out.println("%d: %s".formatted(num,map3.get(num)));
        }
        System.out.println("------------------");
        if(!map3.containsKey(4)){
            map3.put(4,"cuatro");
        }
        map3.remove(1,"uno");
        map3.replace(3,"TRES");
        System.out.println("------------------");
        for(int num: map3.keySet()){
            System.out.println("%d: %s".formatted(num,map3.get(num)));
        }
        LinkedHashMap <String,String> map4 = new LinkedHashMap<>(); //La referencia puede ser de tipo Map
        map4.put("uno","uno");
        map4.put("dos","dos");
        map4.put("tres","tres");
        for (String key: map4.keySet()){
            System.out.println("%s: %s".formatted(key,map4.get(key)));
        }
        System.out.println("------------------");
        TreeMap <Integer,Integer> map5 = new TreeMap<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++){
            int n = random.nextInt(100);
            map5.put(n,n*n);
        }
        Map.Entry<Integer,Integer> entry = map5.firstEntry();
        System.out.println("La primera entrada es: %d: %d".formatted(entry.getKey(),entry.getValue()));
        int mayorQueValor = map5.ceilingKey(50);
        System.out.println("---");
        for (int num: map5.keySet()){
            System.out.println("%d: %d".formatted(num,map5.get(num)));
        }
        System.out.println("---");
        for(int num: map5.descendingKeySet()){
            System.out.println("%d: %d".formatted(num,map5.get(num)));
        }
        System.out.println("---");

    }
}
