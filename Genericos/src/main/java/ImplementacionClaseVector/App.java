package ImplementacionClaseVector;

public class App {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        System.out.println(vector.size());
        vector.add("Hola");
        vector.add("Mundo");
        vector.add("Java");
        vector.add("Kotlin");
        for(int i = 0; i < vector.size(); i++){
            System.out.println(vector.get(i));
        }
        System.out.println(vector.size());
    }
}
