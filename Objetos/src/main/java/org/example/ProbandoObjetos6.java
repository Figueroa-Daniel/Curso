package org.example;

import java.util.Scanner;

public class ProbandoObjetos6 {
    private Scanner tec;
    private int num1,num2;
    public void inicializar() {
        tec = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        num1 = tec.nextInt();
        System.out.println("Ingrese el segundo número:");
        num2 = tec.nextInt();
    }
    public void sumar() {
        int suma = num1 + num2;
        System.out.println("La suma de los números es: " + suma);
    }
    public void restar() {
        int resta = num1 - num2;
        System.out.println("La resta de los números es: " + resta);
    }
    public void multiplicar() {
        int multiplicacion = num1 * num2;
        System.out.println("La multiplicación de los números es: " + multiplicacion);
    }
    public void dividir() {
        if (num2 == 0) {
            System.out.println("No se puede dividir por 0");
        } else {
            int division = num1 / num2;
            System.out.println("La división de los números es: " + division);
        }
    }
    public static void main(String[] args) {
        ProbandoObjetos6 calculadora1;
        calculadora1 = new ProbandoObjetos6();
        calculadora1.inicializar();
        calculadora1.sumar();
        calculadora1.restar();
        calculadora1.multiplicar();
        calculadora1.dividir();
    }

}
