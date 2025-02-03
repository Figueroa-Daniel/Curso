package org.example;

public class StringB {
    public static void main(String[] args) {
        String palabra = "java";
        StringBuilder sb = new StringBuilder(palabra);
        //Imprime la palabra al revés
        System.out.println(sb.reverse());
        //Añadir una palabra al final
        sb.append("Script");
        System.out.println(sb);
        //capacidad actual que tiene el StringBuilder
        System.out.println(sb.capacity());
        //insertar una palabra en la posición 4
        sb.insert(4, " es diferente a java");
        System.out.println(sb);
        //remplazar una palabra
        sb.replace(0, 4, "Java");
        System.out.println(sb);
        //eliminar una palabra
        sb.delete(0, 4);
        System.out.println(sb);
        //eliminar caracter
        sb.deleteCharAt(0);
        System.out.println(sb);
        //revertir la frase
        sb.reverse();
        System.out.println(sb);
        //revertir la palabra
        String nueva= "hola buenos dias";
        String invertedPart = invertSubstring(nueva, 0,4);
        System.out.println(invertedPart);
        //cambiar caracter
        sb.setCharAt(0, 'J');
        System.out.println(sb);
        //substring de stringbuilder
        String subs= sb.substring(0, 4);
        System.out.println(subs);
        System.out.println(sb.substring(6));
        //convierte el StringBuilder a String
        String str = sb.toString();
    }
    public static String invertSubstring(String str, int start, int end) {
        char[] chars = str.toCharArray();
        while (start < end - 1) {
            char temp = chars[start];
            chars[start] = chars[end - 1];
            chars[end - 1] = temp;
            start++;
            end--;
        }
        return new String(chars);
    }
}
