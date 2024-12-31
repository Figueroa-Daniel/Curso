package org.example;

import java.util.Scanner;

public class ProbandoObjetos7 {
    public void cargarValor(){
        Scanner tec = new Scanner(System.in);
        int valor;
        do {
            System.out.println("Ingrese el valor(para finalizar ingrese -1): ");
            valor = tec.nextInt();
            if (valor != -1) {
                calcular(valor);
            }
        }while (valor != -1);
    }
    public void calcular(int v){
        for(int f=1;f<=10;f++){
            System.out.print(f*v+"-");
        }
    }
    public static void main(String[] args) {
        ProbandoObjetos7 tabla = new ProbandoObjetos7();
        tabla.cargarValor();
    }
}
