package Biblioteca;

public class App {
    public static void main(String[] args) {
        Libro libro = new Libro("El quijote", "Cervantes", "1605", "Novela");
        Libro libro1 = new Libro("El principito", "Antoine de Saint-Exupéry", "1943", "Cuento");
        Libro libro2 = new Libro("Donde viven los monstruos", "Maurice Sendak", "1963", "Cuento");
        Libro libro3 = new Libro("Orgullo y prejuicio", "Jane Austen", "1813", "Novela");
        Libro libro4 = new Libro("El retrato de Dorian Gray", "Oscar Wilde", "1890", "Novela");
        Libro libro5 = new Libro("El señor de los anillos", "J.R.R. Tolkien", "1954", "Fantasía");
        Usuario usuario = new Usuario("Juan", "1234");
        Usuario usuario1 = new Usuario("Pedro", "5678");
        usuario.añadirLibro(libro);
        usuario.añadirLibro(libro);
        usuario.añadirLibro(libro1);
        usuario.añadirLibro(libro2);
        usuario.añadirLibro(libro3);
        usuario.añadirLibro(libro5);
        usuario.devolverLibroUsuario("El señor de los anillos");
        usuario.mostrarLibrosPrestados();
        usuario1.añadirLibro(libro5);


    }
}
