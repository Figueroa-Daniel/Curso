package org.example;

public class FraseAPalabras {
    public static void main(String[] args) {
        //Pasar cadena a array
        String frase = "Hola que tal buenas tardes a todos y a todas";
        String[] palabras = frase.split(" ");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}
