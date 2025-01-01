package org.example;

import java.util.Scanner;

public class ProbandoObjetos11 {
    private Scanner tec;
    private float[] turnoManana;
    private float[] turnoTarde;
    public void cargarSueldos(){
        tec = new Scanner(System.in);
        turnoManana = new float[4];
        turnoTarde = new float[4];
        for (int i = 0; i < turnoManana.length; i++) {
            System.out.println("Ingrese el sueldo del empleado " + (i + 1) + " del turno de la mañana: ");
            turnoManana[i] = tec.nextFloat();
        }
        for (int i = 0; i < turnoTarde.length; i++) {
            System.out.println("Ingrese el sueldo del empleado " + (i + 1) + " del turno de la tarde: ");
            turnoTarde[i] = tec.nextFloat();
        }
    }
    public void gastosTurnoManana(){
        float gastos = 0;
        for (int i = 0; i < turnoManana.length; i++) {
            gastos += turnoManana[i];
        }
        System.out.println("Los gastos del turno de la mañana son: " + gastos);
    }
    public void gastosTurnoTarde(){
        float gastos = 0;
        for (int i = 0; i < turnoTarde.length; i++) {
            gastos += turnoTarde[i];
        }
        System.out.println("Los gastos del turno de la tarde son: " + gastos);
    }
    public static void main(String[] args) {
        ProbandoObjetos11 sueldos = new ProbandoObjetos11();
        sueldos.cargarSueldos();
        sueldos.gastosTurnoManana();
        sueldos.gastosTurnoTarde();
    }
}
