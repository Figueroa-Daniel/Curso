package ProgramacionFuncionalAvanzada.map;

import ProgramacionFuncionalAvanzada.Developer;
import ProgramacionFuncionalAvanzada.Task;

import java.util.Comparator;
import java.util.List;

import static java.util.Arrays.stream;


public class MapDemo {
    public static void main(String[] args) {
        List<String> names = List.of("patricia","antonio","juan","raquel","juan");
        names.stream()
                .map(String::toUpperCase)
                .distinct()
                .sorted(Comparator.comparing(String::length)).forEach(System.out::println); //17:15
        List<Developer> developers = getDevelopers();
        developers.stream()
                .flatMap(dev -> dev.getTasks().stream())
                .filter(task -> task.getHours()   > 5)
                .forEach(System.out::println);
        // lo mismo pero con 3 listas de integger
        List<Integer> list1 = List.of(1, 2, 3);
        List<Integer> list2 = List.of(4, 5, 6);
        List<Integer> list3 = List.of(7, 8, 9);
        List<List<Integer>> lists = List.of(list1, list2, list3);
        List<Integer> results = lists.stream()
                .flatMap(List::stream)
                .filter(num -> num > 5)
                .map(num -> num*num)
                .toList();
        // el peek serviria para depurar el flujo de datos
    }
    private static List<Developer> getDevelopers(){
        Task task1 = new Task(1L, "Description 1", 5);
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
