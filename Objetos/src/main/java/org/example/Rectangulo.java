package org.example;

import java.util.Arrays;

public class Rectangulo {

    private final int COORD_X = 0;
    private final int COORD_Y = 1;
    private double[] c1, c2, c3, c4;
    public double base(){
        return Math.abs(c1[COORD_X] - c2[COORD_X]);
    }
    public double altura(){
        return Math.abs(c1[COORD_Y] - c4[COORD_Y]);
    }
    public void dibujar(char c) {
        int base = (int) Math.round(base());
        int altura = (int) Math.round(altura());
        String linea = "" + c;
        System.out.println(linea.repeat(base));
        if (altura > 2) {
            for (int i = 0; i < base; i++) {
                System.out.print(linea);
                if (base > 2) {
                    System.out.print(" ".repeat(base - 2));
                }
                System.out.println(linea);
            }
            System.out.println(linea.repeat(base));
        }
    }
    public Rectangulo(double[] c1, double[] c2, double[] c3, double[] c4) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.c4 = c4;
    }

    public int getCOORD_X() {
        return COORD_X;
    }

    public int getCOORD_Y() {
        return COORD_Y;
    }

    public double[] getC1() {
        return c1;
    }

    public void setC1(double[] c1) {
        this.c1 = c1;
    }

    public double[] getC2() {
        return c2;
    }

    public void setC2(double[] c2) {
        this.c2 = c2;
    }

    public double[] getC3() {
        return c3;
    }

    public void setC3(double[] c3) {
        this.c3 = c3;
    }

    public double[] getC4() {
        return c4;
    }

    public void setC4(double[] c4) {
        this.c4 = c4;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "COORD_X=" + COORD_X +
                ", COORD_Y=" + COORD_Y +
                ", c1=" + Arrays.toString(c1) +
                ", c2=" + Arrays.toString(c2) +
                ", c3=" + Arrays.toString(c3) +
                ", c4=" + Arrays.toString(c4) +
                '}';
    }
}
