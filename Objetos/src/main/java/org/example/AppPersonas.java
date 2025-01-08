package org.example;

public class AppPersonas {
    public static void main(String[] args) {
        ObjetosCurso persona = new ObjetosCurso("Juan", 25, 1.75);
        persona.mayorAltura();
        persona.mostrarDatos();
        persona.crecer();
        persona.mostrarDatos();
        System.out.println(persona);
    }
}
