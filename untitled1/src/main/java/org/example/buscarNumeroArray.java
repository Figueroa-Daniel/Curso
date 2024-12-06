package org.example;
//Este programa muestra los numeros que faltan en un array ordenado
public class buscarNumeroArray {
    public static void main(String[] args) {
        int[] a = {0, 1, 2, 4, 5, 7}; // Array de ejemplo
        int posicionInicial = 0; // Posición inicial
        int contador = 0; // Contador para calcular números faltantes
        findMissingNumbers(a, posicionInicial, contador); // Llamada inicial al método
    }

    /**
     * Método recursivo para encontrar números faltantes en un array ordenado.
     *
     * @param a El array de números enteros ordenados.
     * @param posicion La posición actual en el array desde donde se buscarán faltantes.
     * @param contador Contador para calcular números faltantes.
     */
    private static void findMissingNumbers(int[] a, int posicion, int contador) {
        // Caso base: si hemos llegado al último elemento del array, terminamos.
        if (posicion >= a.length - 1)
            return;

        // Variable local para controlar si se encuentra un número faltante
        boolean encontrado = false;

        // Recorremos desde la posición actual hasta el siguiente valor esperado en el array
        while (a[posicion] + 1 != a[posicion + 1]) {
            System.out.println("Número faltante: " + (a[posicion] + 1)); // Imprime el número faltante
            a[posicion]++; // Incrementa el valor actual para verificar el próximo número
            encontrado = true;
        }

        // Si se encontró un número faltante, se realiza una llamada recursiva para continuar
        if (encontrado) {
            findMissingNumbers(a, posicion, contador);
        } else {
            // Si no hay números faltantes en esta posición, avanza al siguiente índice
            findMissingNumbers(a, posicion + 1, contador);
        }
    }
}
