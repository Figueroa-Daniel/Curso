package org.example;

import java.time.LocalDate;

public record Empleado(String nombre, String apellidos, LocalDate fechaContratacion) {
}
