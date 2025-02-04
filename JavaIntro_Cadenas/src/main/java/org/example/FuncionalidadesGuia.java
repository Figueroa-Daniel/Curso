package org.example;

public class FuncionalidadesGuia {
    public static void main(String[] args) {
        System.out.println("Este es el archivo de FuncionalidadesGuia");
        String cadena = "Hola Mundo";
        int longitud = cadena.length();  //Devuelve la longitud de la cadena
        char carc = cadena.charAt(4); //Devuelve el caracter del respectivo indice
        String sub = cadena.substring(2,4); //Devuelve la cadena que hay entre los dos indices
        cadena.toUpperCase(); //Pasa todo a mayusculas
        cadena.toLowerCase(); //Pasa todo a minusculas
        String cadena1 = "Hola";
        String cadena2 = "ola";
        cadena1.equals(cadena2); //Devuelve true si las cadenas son iguales
        cadena1.equalsIgnoreCase(cadena2); //Devuelve true si las cadenas son iguales ignorando las mayusculas o minusculas
        cadena1.startsWith(cadena2); //Si empieza igual devuelve true
        cadena1.endsWith(cadena2); //Si termina igual devuelve true
        cadena.contains("otra cadena"); //Si contiene dicha cadena en alguna parte devuelve true
        int posN = cadena.indexOf('n'); //Busca la primera ocurrencia de la cadena
        int lastPosN = cadena1.lastIndexOf("n"); //Busca la ultima ocurrencia de la cadena
        // replace, replaceAll
        cadena1.replace('a', 'o'); //Remplaza todas las a por las o
       cadena1.replace("La Mancha", "España"); //Remplaza todas las "La Mancha" por "España"
    }
}
