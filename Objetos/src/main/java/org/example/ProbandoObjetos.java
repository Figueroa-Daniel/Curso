package org.example;
import java.util.Scanner;
public class ProbandoObjetos {
    private Scanner tec;
    private String nombre;
    private int edad;
    public void inicializar() {
        tec = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        nombre = tec.nextLine();
        System.out.println("Ingrese su edad:");
        edad = tec.nextInt();
    }
    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
    public void esMayorEdad() {
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }
    }
    public static void main(String[] args) {
        ProbandoObjetos persona1;
        persona1 = new ProbandoObjetos();
        persona1.inicializar();
        persona1.imprimir();
        persona1.esMayorEdad();
    }
}
