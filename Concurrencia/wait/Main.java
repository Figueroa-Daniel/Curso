package Concurrencia.wait;

public class Main {
    public static void main(String[] args) throws InterruptedException {
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
        hilo.join(); // Espera a que el hilo termine su ejecución, sin el se ejecutaría el bloque posterior antes de que el hilo termine
        System.out.println("My name is: " + Thread.currentThread().getName() + " and my state is: " + Thread.currentThread().getState());

    }
}
