package org.example;
import java.util.Scanner;
public class ProbandoObjetos2 {
    private Scanner tec;
    private int altura;
    private int base;
    public void inicializar() {
        tec = new Scanner(System.in);
        System.out.println("Ingrese la base:");
        base = tec.nextInt();
        System.out.println("Ingrese la altura:");
        altura = tec.nextInt();
    }
    public int calcularArea(){
        return (base * altura)/2;
    }
    public void imprimir(){
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Area: " + calcularArea());
    }
    public static void main(String[] args) {
        ProbandoObjetos2 triangulo;
        triangulo = new ProbandoObjetos2();
        triangulo.inicializar();
        triangulo.imprimir();
    }


}
