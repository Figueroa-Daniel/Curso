package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

//puede implementar interfaces
public record Alumno(String nombre, String apellidos, String email, int edad) {
    public Alumno{
        Objects.requireNonNull(nombre); //impide que sea nulo
        Objects.requireNonNull(apellidos); //impide que sea nulo
    }
    //public Alumno(String nombre, String apellidos, int edad){
    //    this(nombre,apellidos, nombre.toLowerCase()+"."+apellidos.toLowerCase()+"@gmail.net",edad);
        //llamar al consctrucor de arriba pero construllendo el gmail

    //}
    public String nombreComloto(){
        return this.nombre+" "+this.apellidos;
    }
    public static final String DOMINIO = "figue.local";

    public Alumno(String nombre,String apellidos, int edad){
        this(nombre,
                apellidos,
                (nombre.toLowerCase()+"."+apellidos.toLowerCase()).replaceAll("\\s","") +DOMINIO,
                edad);
    }
    public static Alumno of (Persona p){ //transformamaos una persona a un alumno
        int edad = (int)ChronoUnit.YEARS.between(p.getFechaDeNacimiento(), LocalDate.now());
        return new Alumno(p.getNombre(), p.getApellidos(),edad);
    }

}
