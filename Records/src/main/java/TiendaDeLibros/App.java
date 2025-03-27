package TiendaDeLibros;

public class App {
    public static void main(String[] args) {
        TiendaLibros tienda = new TiendaLibros(3);
        tienda.agregarLibro(new Libro("Libro 1", "Autor 1", Genero.FICCION, 100.0));
        tienda.agregarLibro(new Libro("Libro 2", "Autor 2", Genero.No_FICCION, 200.0));
        tienda.agregarLibro(new Libro("Libro 3", "Autor 3", Genero.CIENCIA, 300.0));
        tienda.mostrarLibros();
        tienda.mostrarLibrosPorGenero(Genero.FICCION);
    }
}
