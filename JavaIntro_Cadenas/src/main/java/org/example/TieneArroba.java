package org.example;

public class TieneArroba {
    public static void main(String[] args) {
        String texto="hola@gmail.com";
        boolean tieneArroba = false;
        for (char c : texto.toCharArray()) {
            if (c == '@') {
                System.out.println("El texto tiene una arroba");
                tieneArroba = true;
                break;
            }
        }
        if (!tieneArroba) {
            System.out.println("El texto no tiene una arroba");
        }

    }
}
