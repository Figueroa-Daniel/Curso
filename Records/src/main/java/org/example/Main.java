package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Alumno a = new Alumno("Paco", "Miranda", "hola@gmail.com",20);
        System.out.println(a);
        System.out.println(a.nombre()+" "+a.apellidos());
        Alumno b = new Alumno("Paco", "Miranda", "hola@gmail.com",20);
        Alumno c = new Alumno("Paco", "Miranda", "hola@gmail.com",21);
        if(a.equals(b)){ // son absolutamente iguales
            System.out.println("Son iguales");
        }
        if(a.equals(c)){ //no son iguales
            System.out.println("Son iguales");
        }
        // Alumno d = new Alumno(null, "Miranda", "hola@gmail.com",21); //Salta excepcion

        Alumno e = new Alumno("Miguel","Machacu",16);
        System.out.println(e);

        Producto p = new Producto(1l," Nombre del producto",20.0);
        System.out.println(p);

        System.out.println(e.nombreComloto());

    }
}