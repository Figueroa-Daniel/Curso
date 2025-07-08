package Concurrencia.avanzada.multiple;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableDemo {
    public static void main(String[] args) {
        Runnable printHello = () -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello");
        };
        Runnable printWorld = () -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for ( int i = 0; i < 5; i++) {
                System.out.println("World " + i);
            }
        };
        ExecutorService executor = Executors.newFixedThreadPool(3);// Asigna una tarea a cada hilo
        System.out.println("begin");
        executor.execute(printHello);
        executor.execute(printWorld);
        executor.execute(printHello);
        System.out.println("end");
        executor.shutdown();
        System.out.println(executor.isShutdown());


    }
}
