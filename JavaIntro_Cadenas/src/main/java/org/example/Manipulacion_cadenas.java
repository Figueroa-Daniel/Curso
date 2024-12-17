package org.example;

public class Manipulacion_cadenas {
    public static void main(String[] args) {
        //suma de caracteres con operador +;
        String msg ="Hola"+"Mundo";
        System.out.println(msg);
        //suma de caracteres con operador +=
        String msg2 = "Hola ";
        msg2+="a todos";
        System.out.println(msg2);
        //Suma de caracteres con concat;
        String msg3 = "Hola ";
        msg3 = msg3.concat("amigos");
        System.out.println(msg3);
        //Suma de caracteres multilinea
        String multi1= """
                Hola 
                y viva el 
                mundo
                """;
        String multi2= """
                mundo
                   mundo
                """;
        System.out.println(multi1+multi2);
        //Suma de caracteres con numericos
        String msgPrecio = "El precio del producto es " + 36.5;
        System.out.println(msgPrecio);
        //Salto de linea
        String msg5 = "Esta cadena tiene un \n de linea";
        System.out.println(msg5);
        //Comillas
        String msg6 = " \"hola\" ";
        System.out.println(msg6);
        //Tabulacion
        String msg7 = "\t holis";
        System.out.println(msg7);
        //Formateo de cadenas
        String msg8 = String.format("Hola me llamo %s y estoy estudiando" ,"Daniel");
        System.out.println(msg8);
        /*
        Especificadores de formato:

            %s Cadena, %c carácter
            %d número entero, %o número octal, %x hexadecimal
            %.f número con decimales, %.nf número con n decimales
            %e número con decimales, notación exponencial
         */
        double precio = 12.32;
        int cantidad = 2;
        String descripcion ="libros";
        String mensaje = String.format("Compró %d %s a un precio de %.2f euros cada uno.",cantidad,descripcion,precio);
        System.out.println(mensaje);

    }
}
