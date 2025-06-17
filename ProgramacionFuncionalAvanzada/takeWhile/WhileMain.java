package ProgramacionFuncionalAvanzada.takeWhile;

import ProgramacionFuncionalAvanzada.Developer;
import ProgramacionFuncionalAvanzada.Task;

import java.util.List;

public class WhileMain {
    //    El método takeWhile en streams de Java se utiliza para tomar elementos desde el inicio del stream
    //    mientras la condición sea verdadera.
    //    En cuanto encuentra el primer elemento que no cumple la condición,
    //    deja de procesar y no evalúa los siguientes, aunque sí podrían cumplir la condición.

    //    Esto es útil cuando los datos están ordenados de tal forma que,
    //    una vez que la condición falla,
    //    ya no tiene sentido seguir buscando más elementos que la cumplan.
    //    Si necesitas filtrar todos los elementos que cumplen una condición,
    //    sin importar el orden, debes usar filter en lugar de takeWhile.
    public static void main(String[] args) {
        List <Developer> developers = getDevelopers();
    System.out.println(developers.stream()
            .flatMap(developer -> developer.getTasks().stream())
            .filter(task -> task.getHours() >= 6)
            .toList());
    // Ahroa usando el takeWhile
    System.out.println(developers.stream()
            .flatMap(developer -> developer.getTasks().stream())
            .takeWhile(task -> task.getHours() >= 6)
            .toList());
    // Ahora usando el dropWhile
    System.out.println(developers.stream()
            .flatMap(developer -> developer.getTasks().stream())
            .dropWhile(task -> task.getHours() >= 6)
            .toList());


    }
    private static List<Developer> getDevelopers(){
        Task task1 = new Task(1L, "Description 1", 7);
        Task task2 = new Task(2L, "Description 2", 3);
        Task task3 = new Task(3L, "Description 3", 8);
        Developer dev1 = new Developer("Alice", 30, List.of(task1, task2));
        Task task4 = new Task(4L, "Description 4", 5);
        Task task5 = new Task(5L, "Description 5", 3);
        Task task6 = new Task(6L, "Description 6", 8);
        Developer dev2 = new Developer("Bob", 25, List.of(task1, task2, task3));
        Task task7 = new Task(7L, "Description 7", 5);
        Task task8 = new Task(8L, "Description 8", 3);
        Developer dev3 = new Developer("Charlie", 28, List.of(task4, task5, task6));
        Task task9 = new Task(9L, "Description 9", 5);
        Task task10 = new Task(10L, "Description 10", 3);
        Developer dev4 = new Developer("David", 35, List.of(task7, task8, task9, task10));
        return List.of(dev1, dev2, dev3, dev4);


    }

}
