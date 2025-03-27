package org.example;

public class App {


    public static void main(String[] args) {
        Object [] array = new Object[4];
        array[0] = new A("Hello");
        array[1] = new A("World");
        array[2] = new B(3.14);
        array[3] = new B(2.71);
        for (Object o : array) {
            System.out.println(o);
        }
    }
}
