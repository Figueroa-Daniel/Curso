package org.example;

public class JavaIntro_Ej4 {
    public static void main(String[] args){
        double radio =5, perimetro,area;
        final double pi= 3.1415;// También se podría usar Math.PI-
        perimetro= 2*pi*radio;
        area= pi*(radio*radio);
        System.out.println("El perimetro es "+perimetro);
        System.out.println("El area es "+area);
    }
}
