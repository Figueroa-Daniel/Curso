package Concurrencia.stop;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread hilo = new Thread(() ->{
            for(int i = 0; i < 5 ; i++){
                System.out.println("Iteracion"+ i);
                try {
                    Thread.sleep(1000); // Pausa de 1 segundo
                } catch (InterruptedException e) {
                    System.out.println("I'm resumed");
                    return;
                }
                //Esto tambien se podria hacer con un if
                // if(Thread.isInterrupted()){
                //System.out.println("I'm resumed");
                // return;
                // }
            }
        });
        hilo.start();

        Thread.sleep(3000L); // Pausa de 5 segundos
        hilo.interrupt();

    }
}
