package org.example;

import java.util.Scanner;

public class Anagrama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resp2="";
        System.out.println("Introduzca la frase");
        String entrada = sc.nextLine();
        String minus = entrada.toLowerCase();
        for(int i=minus.length()-1;i>=0;i--){
            resp2=resp2+minus.charAt(i);
        }
        System.out.println(resp2);
        if(resp2.equals(minus)){
            System.out.println("Es un anagrama");
        }
        else {
            System.out.println("No es un anagrama");
        }
    }
}
