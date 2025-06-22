package Concurrencia.pause;

public class Main {
    public static void main(String[] args) {
        Thread hilo = new Thread(() -> {
            for(int i = 0; i < 5 ; i++){
                System.out.println("Iteracion"+ i);
                try {
                    Thread.sleep(1000); // Pausa de 1 segundo
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        hilo.start();
    }
}
