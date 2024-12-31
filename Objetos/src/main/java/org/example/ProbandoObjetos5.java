package org.example;

import java.util.Scanner;

public class ProbandoObjetos5 {
    private Scanner tec;
    private String nombreEmpleado;
    private int sueldo;
    public void inicializar() {
        tec = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado:");
        nombreEmpleado = tec.nextLine();
        System.out.println("Ingrese el sueldo del empleado:");
        sueldo = tec.nextInt();
    }
    public void imprimir() {
        System.out.println("Nombre del empleado: " + nombreEmpleado);
        System.out.println("Sueldo del empleado: " + sueldo);
    }
    public void calcularImpuestos() {
        if (sueldo > 3000) {
            System.out.println("Debe pagar impuestos");
        } else {
            System.out.println("No debe pagar impuestos");
        }
    }
    public static void main(String[] args) {
        ProbandoObjetos5 empleado1;
        empleado1 = new ProbandoObjetos5();
        empleado1.inicializar();
        empleado1.imprimir();
        empleado1.calcularImpuestos();
    }

}
