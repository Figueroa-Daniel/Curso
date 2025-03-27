package ListaTareas;

import java.time.LocalDate;

public record Tarea(String nombre, String descripcion, LocalDate fechaVencimiento) {
}
