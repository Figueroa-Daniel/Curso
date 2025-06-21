package Concurrencia.allthreads;

public class Main {
    public static void main(String[] args) {
        Thread.getAllStackTraces()
                .keySet()
                .forEach(thread ->{
                    System.out.println(thread.getId());
                    System.out.println(thread.getName());
                    System.out.println(thread.getState());
                    System.out.println(thread.isAlive());
                });
        9:00
    }
}
