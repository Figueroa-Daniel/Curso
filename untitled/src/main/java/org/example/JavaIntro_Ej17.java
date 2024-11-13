package org.example;

import java.util.Scanner;

public class JavaIntro_Ej17 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Dime una letra y te diré si es vocal o no: ");
        String letra = sc.nextLine();
        switch (letra){
            case "a","e","i","o","u":
                System.out.println("La letra es vocal");
                break;
            case "1","2","3","4","5","6","7","8","9":
                System.out.println("Es un numero de un digito");
                break;

            default:
                System.out.println("Es una  letra consonante o un numero o un signo");
                break;
        }
        sc.close();
    }
}
