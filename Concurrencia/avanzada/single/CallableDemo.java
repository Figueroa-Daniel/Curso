package Concurrencia.avanzada.single;

import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        var executor = Executors.newSingleThreadExecutor();
        Callable<Integer> task = () -> {
            Thread.sleep(5000L);
            return 50 +50;
        };
        Future<Integer> resultado = executor.submit(task);
        Integer result = resultado.get(30, TimeUnit.SECONDS);
        System.out.println("El resultado es: " + result);
        System.out.println("fin");
        executor.shutdown();
        19:00
    }
}
