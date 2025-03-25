package org.example;

import java.util.Objects;

public record Alumno(String nombre, String apellidos, String email, int edad) {
    public Alumno{
        Objects.requireNonNull(nombre); //impide que sea nulo
        Objects.requireNonNull(apellidos); //impide que sea nulo
    }
}
