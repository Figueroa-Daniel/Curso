package TiendaDeLibros;

public class TiendaLibros {
    private Libro[] libro;
    private int cantidadLibros;

    public TiendaLibros(int capacidad){
        libro = new Libro[capacidad];
        cantidadLibros = 0;
    }
    public void agregarLibro(Libro libro){
        if(cantidadLibros < this.libro.length){
            this.libro[cantidadLibros] = libro;
            cantidadLibros++;
        }else {
            System.out.println("No se pueden agregar más libros");
        }
    }
    public void mostrarLibros(){
        System.out.println("Lista de libros");
        for (int i = 0; i < cantidadLibros; i++) {
            System.out.println(libro[i]);
        }
    }
    public void mostrarLibrosPorGenero(Genero generoBusqueda){
        System.out.println("Libros de genero "+generoBusqueda+": ");
        for (int i = 0; i < cantidadLibros; i++) {
            if(libro[i].genero().equals(generoBusqueda)){
                System.out.println(libro[i]);
            }
        }
    }
}
