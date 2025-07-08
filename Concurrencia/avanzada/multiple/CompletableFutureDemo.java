package Concurrencia.avanzada.multiple;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {
    public static void main(String[] args) {
        CompletableFuture<Void> cf1 = CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("Task 1 completed");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        CompletableFuture<Void> cf2 = CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(3000);
                System.out.println("Task 2 completed");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        CompletableFuture.allOf(cf1, cf2).join(); // Espera a que ambas tareas se completen
    }

}
