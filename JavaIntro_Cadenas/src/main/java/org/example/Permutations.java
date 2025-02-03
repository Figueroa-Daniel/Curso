/**
 * Clase que genera todas las permutaciones posibles de una palabra usando dos algoritmos diferentes.
 *
 * @author Daniel Figueroa
 * @version 1.0
 */
package org.example;

public class Permutations {

    /**
     * Punto de entrada principal del programa.
     * Ejecuta ambos algoritmos de generación de permutaciones para la palabra "hola".
     *
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        String palabra = "ho";
        generarPermutaciones("", palabra);
        permute(palabra.toCharArray(), 0);
    }

    /**
     * Genera permutaciones recursivamente mediante construcción incremental de cadenas.
     *
     * @param prefijo Parte ya construida de la permutación
     * @param restantes Caracteres disponibles para permutar
     */
    private static void generarPermutaciones(String prefijo, String restantes) {
        if (restantes.isEmpty()) {
            System.out.println(prefijo);
            return;
        }

        for (int i = 0; i < restantes.length(); i++) {
            char actual = restantes.charAt(i);
            String nuevasRestantes = restantes.substring(0, i) + restantes.substring(i + 1);
            generarPermutaciones(prefijo + actual, nuevasRestantes);
        }
    }

    /**
     * Genera permutaciones mediante backtracking y swaps en un arreglo de caracteres.
     * Versión más eficiente que evita creación múltiple de objetos String.
     *
     * @param caracteres Arreglo de caracteres a permutar
     * @param inicio Índice inicial para comenzar la permutación
     */
    private static void permute(char[] caracteres, int inicio) {
        if (inicio == caracteres.length) {
            System.out.println(new String(caracteres));
            return;
        }

        for (int i = inicio; i < caracteres.length; i++) {
            intercambiar(caracteres, inicio, i);
            permute(caracteres, inicio + 1);
            intercambiar(caracteres, inicio, i); // Backtracking
        }
    }

    /**
     * Método auxiliar para intercambiar dos elementos en un arreglo.
     *
     * @param arr Arreglo objetivo
     * @param i Primer índice a intercambiar
     * @param j Segundo índice a intercambiar
     */
    private static void intercambiar(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}