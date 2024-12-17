package org.example;

import java.util.Scanner;

public class EjercicioPalindromo {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Introduzca la frase");
        String entrada = sc.nextLine();
        //pasamos a minúsculas
        String minus = entrada.toLowerCase();
        //Limpiamos la cadena

        //Espacios en blanco
        String limpia1 = minus.trim();
        String limpia ="";
        //Queremos limpiar de espacios a mitad o de vocales acentuadas
        for(int i=0;i<limpia1.length();i++){
            String sub = limpia1.substring(i,i+1);
            if(!sub.isBlank()){
                sub = switch(sub) {
                    case "á" -> "a";
                    case "é" -> "e";
                    case "í" -> "i";
                    case "ó" -> "o";
                    case "ú" -> "u";
                    default -> sub;
                };
                limpia += sub;
            }
        }
        //Esto limpiaría la cadena del todo
        //Ahora queremos obtener la cadena inversa
        String inversa="";
        for(int i = limpia.length()-1; i>=0;i--){
            inversa+=limpia.charAt(i);
        }
        //comprobamos si son iguales
        if(limpia.equals(inversa)){
            System.out.println("Es un palíndromo");
        }
        else {
            System.out.println("No es un palindromo");
        }
        sc.close();

    }
}
