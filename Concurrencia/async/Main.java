package Concurrencia.async;

public class Main {
    public static void main(String[] args) {
        //No van en orden secuencial, se ejecutan de manera asíncrona
        Thread thread1 = new Thread(() -> System.out.println("Hola1"));
        Thread thread2 = new Thread(() -> System.out.println("Hola2"));
        Thread thread3 = new Thread(() -> System.out.println("Hola3"));

        System.out.println("inicio");
        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println("fin");
        //Con el metodo run se ejecuta de manera secuencial
    }
}
