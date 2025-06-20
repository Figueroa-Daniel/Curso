package MetodosDeReferencia.constructorMetodos;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<Employee> generator = () -> new Employee();
        Supplier<Employee> generator2 = Employee::new;// Método de referencia al constructor, sin pasarle ningun argumento(depende del constructor)
        // Si le pasamos un argumento, debemos usar una expresión lambda
        Supplier<Employee> generator3 = () -> new Employee("John Doe");
        // Podriamos usar una interfaz funciona que reciba un String.
        EmployeeWithName generator4  = name -> new Employee(name);
        // Esto si se podría usar como método de referencia.
        EmployeeWithName generator5  = Employee::new;
        generator4.create("Jane Doe"); // Crea un nuevo empleado con el nombre "Jane Doe")
        System.out.println(generator5.create("Jane Doe").getName()); // Crea un nuevo empleado con el nombre "Jane Doe" y obtiene su nombre

        // Ahora probaremos dos argumentos
        // Asi sería con una expresión lambda
        BiFunction <String, Integer, Employee> generator6 = (name, age) -> new Employee(name, age);

        // Asi sería con un método de referencia al constructor
        BiFunction <String, Integer, Employee> generator7 = Employee::new; // Método de referencia al constructor con dos argumentos

        // Ahora podemos usarlo
        System.out.println(generator6.apply("Alice", 30)); // Crea un nuevo empleado con el nombre "Alice" y la edad 30
        System.out.println(generator7.apply("Bob", 25)); // Crea un nuevo empleado con el nombre "Bob" y la edad 25
        //49:00


    }
}
