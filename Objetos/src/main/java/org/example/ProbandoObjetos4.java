package org.example;

import java.util.Scanner;

public class ProbandoObjetos4 {
        private Scanner tec;
        private int lado;
        private int superficie;
        private int perimetro;
        public void inicializar() {
            tec = new Scanner(System.in);
            System.out.println("Ingrese el valor del lado:");
            lado = tec.nextInt();
        }
        public void calcularSuperficie() {
            superficie = lado * lado;
            System.out.println("La superficie del cuadrado es: " + superficie);
        }
        public void calcularPerimetro() {
            perimetro = lado * 4;
            System.out.println("El perimetro del cuadrado es: " + perimetro);
        }
        public static void main(String[] args) {
            ProbandoObjetos4 cuadrado1;
            cuadrado1 = new ProbandoObjetos4();
            cuadrado1.inicializar();
            cuadrado1.calcularSuperficie();
            cuadrado1.calcularPerimetro();
        }

}
