package ListaTareas;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        ListaDeTareas lista = new ListaDeTareas(3);
        lista.agregarTarea(new Tarea("Tarea 1", "Descripcion 1", LocalDate.of(2021, 10, 10)));
        lista.agregarTarea(new Tarea("Tarea 2", "Descripcion 2", LocalDate.of(2021, 10, 11)));
        lista.agregarTarea(new Tarea("Tarea 3", "Descripcion 3", LocalDate.of(2021, 10, 11)));
        lista.mostrarTareas();
        lista.mostrarTareasPorFecha(LocalDate.of(2021, 10, 11));
    }
}
