package org.example;

public class Funcionalidades {
    public static void main(String[] args) {
        /*
            int long = cadena.length();  Devuelve la longitud de la cadena
            char carc = cadena.charAt(indice); Devuelve el caracter del respectivo indice
            String sub = str.substring(n1,n2); Devuelve la cadena que hay entre los dos indices
            cadena.toUpperCase(); Pasa todo a mayusculas
            cadena.toLowerCase(); Pasa todo a minusculas
            cadena1.equals(cadena2); Devuelve true si las cadenas son iguales
            cadena1.equalsIgnoreCase(cadena2) Devuelve true si las cadenas son iguales ignorando las mayusculas o minusculas
            cadena1.startWith(otraCadena) Si empieza igual devuelve true
            cadena1.endsWith(otraCadena) Si termina igual devuelve true
            cadena.contains("otra cadena") Si contiene dicha cadena en alguna parte devuelve true
            int posN = str.indexOf('n'); Busca la primera ocurrencia de la cadena
            int lastPosN = str.lastIndexOf("n"); Busca la ultima ocurrencia de la cadena
            // replace, replaceAll
            str.replace('a', 'o') Remplaza todas las a por las o
            str.replace("La Mancha", "España") Remplaza todas las "La Mancha" por "España"

         */
        // join
        String lang = String.join("-", "Java", "C", "Python", "Go");
        System.out.println(lang); //resultado: Java-C-Python-Go

        // trim. quita los espacios en blanco del inicio y del final
        String withSpaces = "    " + lang + "    ";
        System.out.println(withSpaces);
        System.out.println("Longitud: " + withSpaces.length());
        System.out.println(withSpaces.trim());
        System.out.println("Longitud: " + withSpaces.trim().length());
        /*
              Java-C-Python-Go
              Longitud: 24
              Java-C-Python-Go
              Longitud: 16
         */

        // formatted -> Sustituye el especificador de formato por la variable que tiene asignada.
        float precio = 12.34f;
        System.out.println("El precio del producto es %.2f".formatted(precio));
        // repeat -> Repite la cadena las veces que quieras
        System.out.println("* *".repeat(20));
        // isBlank, isEmpty
        String vacia1 = "    \t    ";
        String vacia2 = "";

        if (vacia1.isBlank()) //Devuelve true si está totalmente vacia
            System.out.println("Está en blanco");

        if (vacia2.isEmpty()) //Devuelve true si está vacia o solo tiene espacios en blanco
            System.out.println("Está totalmente vacía");
        // getchar
        // split->convertir cadena en un array
        char i=2;
        if(Character.isDigit(i)){
            System.out.println("Es digito");
        }
        if (Character.isLetter(i)){
            System.out.println("Es letra");
        }
        if (Character.isSpaceChar(i)){
            System.out.println("Es un espacio");
        }



    }
}
