package Concurrencia.create.way1;

public class CustomThread extends Thread{
    @Override
    public void run() {
        System.out.println("My name is: " + this.getName() + " and my state is: " + this.getState());
    }
}
