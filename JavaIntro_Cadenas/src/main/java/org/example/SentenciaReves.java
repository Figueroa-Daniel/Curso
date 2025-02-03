package org.example;

public class SentenciaReves {
    public static void main(String[] args) {
        String frase = "hola buenos dias";
        String[] palabras = frase.split(" ");
        for(int i = palabras.length - 1; i >= 0; i--) {
            System.out.print(palabras[i] + " ");
        }
    }
}
