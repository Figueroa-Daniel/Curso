package ListaTareas;

import java.time.LocalDate;

public class ListaDeTareas {
    private Tarea[] listaTareas;
    private int cantidadTareas;
    public ListaDeTareas(int capacidad){
        listaTareas = new Tarea[capacidad];
        cantidadTareas = 0;
    }
    public void agregarTarea(Tarea tarea){
        if(cantidadTareas < listaTareas.length){
            listaTareas[cantidadTareas] = tarea;
            cantidadTareas++;
        }else {
            System.out.println("No se pueden agregar más tareas");
        }
    }
    public void mostrarTareas(){
        System.out.println("Lista de tareas");
        for (int i = 0; i < cantidadTareas; i++) {
            System.out.println(listaTareas[i]);
        }
    }
    public void mostrarTareasPorFecha(LocalDate fechaBusqueda){ //busqueda de tareas por fecha de vencimiento
        System.out.println("Tareas que vencen el "+fechaBusqueda+": ");
        for (int i = 0; i < cantidadTareas; i++) {
            if(listaTareas[i].fechaVencimiento().equals(fechaBusqueda)){
                System.out.println(listaTareas[i]);
            }
        }
    }
}
