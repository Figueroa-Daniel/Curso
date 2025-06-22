package Concurrencia.polling;

import java.util.*;

public class Main {
    static List<String> messages = List.of("message1", "message2", "message3", "message4");
    static long patience = 50000;
    public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().setName("thread1");
        long startTime = System.currentTimeMillis();
        Thread thread2 = new Thread(() -> {
            Thread.currentThread().setName("thread2");
            print("iniciando trabajo");
            try{
                for(String msg : messages){
                    Thread.sleep(4000);
                    print(msg);
                }
                print("terminando trabajo");
            }catch(InterruptedException e){
                print("interrumpido");
            }

        });
        thread2.start();
        while (thread2.isAlive()){
            print("continuo esperando");
            thread2.join(1000L);
            long endTime = System.currentTimeMillis();
            long elapsedTime = endTime - startTime;
            if(elapsedTime > patience && thread2.isAlive()){
                print("Tiempo de espera agotado");
                thread2.interrupt();
                thread2.join();
            }
        }
        print("fin");
    }
    static void print(String message){
        String threadName = Thread.currentThread().getName();
        System.out.format("%s: %s%n", threadName, message);
    }
}
