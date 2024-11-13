package org.example;

import java.util.Scanner;

public class JavaIntro_Ej1 {
    public static void main(String []args){
        var sc = new Scanner(System.in);
        System.out.println("Dime el costo de fabricación:");
        double costoFabricacion = sc.nextDouble();
        double magenGanancia = 0.3, impuestos = 0.21;

        double costeConGanancia = costoFabricacion + costoFabricacion *magenGanancia;
        double impuestosAplicados = costeConGanancia * impuestos;
        double precioFinal =costeConGanancia + impuestosAplicados;

        System.out.println("El precio final del portátil es :"+ precioFinal);
        String tipoPrecio = (precioFinal <= 600) ? "NORMAL" : "DE LUJO";
        System.out.println("El portatil tiene un precio"+ tipoPrecio);



        sc.close();
    }
}
