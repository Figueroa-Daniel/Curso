package Concurrencia.create.way2lambdas;

public class Main {
    public static void main(String[] args) {
        Thread hilo = new Thread(() -> System.out.println("My name is: " + Thread.currentThread().getName() + " and my state is: " + Thread.currentThread().getState()));
        hilo.start();
        // También es comun hacerlo de esta manera:
        new Thread(() -> System.out.println("My name is: " + Thread.currentThread().getName() + " and my state is: " + Thread.currentThread().getState())).start();

    }
}

