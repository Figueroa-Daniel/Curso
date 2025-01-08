package org.example;

import java.util.Objects;

public class MayorEdad {
    private String nombre;
    private int edad;
    private String apellidos;
    private String email;
    private String telefono;
    private double altura;

    public MayorEdad() {
        this.nombre = nombre;
        this.edad = edad;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.email = email;
    }
    public MayorEdad(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public boolean esMayorEdad() {
        return (edad >= 18);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "MayorEdad{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", apellidos='" + apellidos + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MayorEdad mayorEdad = (MayorEdad) o;
        return edad == mayorEdad.edad && Objects.equals(nombre, mayorEdad.nombre) && Objects.equals(apellidos, mayorEdad.apellidos) && Objects.equals(email, mayorEdad.email) && Objects.equals(telefono, mayorEdad.telefono);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, apellidos, email, telefono);
    }
}
