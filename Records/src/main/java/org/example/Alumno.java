package org.example;

import java.util.Objects;

public record Alumno(String nombre, String apellidos, String email, int edad) {
    public Alumno{
        Objects.requireNonNull(nombre); //impide que sea nulo
        Objects.requireNonNull(apellidos); //impide que sea nulo
    }
    public Alumno(String nombre, String apellidos, int edad){
        this(nombre,apellidos, nombre.toLowerCase()+"."+apellidos.toLowerCase()+"@gmail.net",edad);
        //llamar al consctrucor de arriba pero construllendo el gmail

    }
    public String nombreComloto(){
        return this.nombre+" "+this.apellidos;
    }
}
