package Concurrencia.create.way2;

public class Main {

    public static void main(String[] args) {
        Runnable task = new CustomRunnable();
        Thread thread1 = new Thread(task);
        thread1.start();
        System.out.println("My name is: " + Thread.currentThread().getName() + " and my state is: " + Thread.currentThread().getState());
    }
}
