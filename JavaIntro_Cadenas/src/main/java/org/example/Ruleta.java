package org.example;

import java.util.Scanner;

public class Ruleta {
    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        boolean[] cargador = {true, false, false, false, false, false};
        int tamano= cargador.length;
        int randomInt = (int) (Math.random() * tamano);

        if (cargador[randomInt] == true) {
            System.out.println("Estas muerto");
            reseteo();

        }
        else {
            System.out.println("Estas vivo :)");
        }


    }
    public static void reseteo (){
        String ANSI_RED = "\u001B[31m";
        String ANSI_RESET="\u001B[0m";
        System.out.println(ANSI_RED + "ERROR" + ANSI_RESET);

        System.out.println("-------------------------------------------------");

        System.out.println(ANSI_RED + "Deleting system32..." + ANSI_RESET);

        System.out.println(ANSI_RED + "Por favor, espera..." + ANSI_RESET);
    }
}