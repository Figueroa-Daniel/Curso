package org.example;
import java.util.Scanner;

public class ProbandoObjetos3 {
    private Scanner tec;
    private int x;
    private int y;
    public void inicializar() {
        tec = new Scanner(System.in);y = tec.nextInt();
        System.out.println("Ingrese un valor para x:");
        x = tec.nextInt();
        System.out.println("Ingrese un valor para y:");
        y = tec.nextInt();
    }
    public void calcularCuadrantes(){
        if (x > 0 && y > 0) {
            System.out.println("Cuadrante 1");
        } else if (x < 0 && y > 0) {
            System.out.println("Cuadrante 2");
        } else if (x < 0 && y < 0) {
            System.out.println("Cuadrante 3");
        } else if (x > 0 && y < 0) {
            System.out.println("Cuadrante 4");
        } else {
            System.out.println("Este en el punto 0");
        }
    }
    public static void main(String[] args) {
        ProbandoObjetos3 punto1;
        punto1 = new ProbandoObjetos3();
        punto1.inicializar();
        punto1.calcularCuadrantes();
    }
}
