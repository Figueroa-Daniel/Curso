package Concurrencia.avanzada.single;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableDemo {
    public static void main(String[] args) {
        Runnable printHello = () -> System.out.println("Hello");
        Runnable printWorld = () -> {
            for ( int i = 0; i < 5; i++) {
                System.out.println("World " + i);
            }
        };
        ExecutorService executor = Executors.newSingleThreadExecutor();
        System.out.println("begin");
        executor.execute(printHello);
        executor.execute(printWorld);
        executor.execute(printHello);
        System.out.println("end");
        executor.shutdown();
        System.out.println(executor.isShutdown());



    }
}
