package Concurrencia.avanzada.single;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Await {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Runnable hello = () -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello!");
        };
        try {
            executor.execute(hello);
            executor.execute(hello);
            executor.execute(hello);
        } finally {
            executor.shutdown();
        }
        executor.awaitTermination(1, TimeUnit.MINUTES);
        //Esta linea provoca que el hilo espere para que lo que pasa a continuación se ejecute después
        System.out.println("end");


    }
}
