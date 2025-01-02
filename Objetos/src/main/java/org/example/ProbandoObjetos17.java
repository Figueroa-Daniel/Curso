package org.example;

import java.util.Scanner;

public class ProbandoObjetos17 {
    private Scanner tec;
    private int[] valores;

    //imprimir n elementos random
    public void cargarNvalores() {
        tec = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de valores que desea ingresar: ");
        int cantidad = tec.nextInt();
        valores = new int[cantidad];
        for (int i = 0; i < valores.length; i++) {
            valores[i] = (int) (Math.random() * 100);
        }
    }

    //imprimir el valor menor
    public boolean menorValor() {
        boolean repetido = false;
        int contador = 0;
        int menor = valores[0];
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] < menor) {
                menor = valores[i];
            }
        }
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] == menor) {
                contador++;
            }
            if (contador > 1) {
                repetido = true;
            }
        }
        System.out.println("El menor valor es: " + menor);
        return repetido;
    }
        public static void main (String[]args) {
            ProbandoObjetos17 valores = new ProbandoObjetos17();
            valores.cargarNvalores();
            boolean comprobador = valores.menorValor();
            if (comprobador) {
                System.out.println("El menor valor se repite");
            } else {
                System.out.println("El menor valor no se repite");
            }
        }

    }