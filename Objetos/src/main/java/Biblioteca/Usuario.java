package Biblioteca;

public class Usuario {
    public String nombre;
    public String identificacion;
    Libro[] librosPrestados = new Libro[5];

    public Usuario(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    public void mostrarLibrosPrestados() {
        for (int i = 0; i < librosPrestados.length; i++) {
            if (librosPrestados[i] != null) {
                System.out.println(librosPrestados[i].titulo);
            }
        }
    }
    public void añadirLibro(Libro libro) {
        boolean prestado = libro.comprobarDisponibilidad();
        if (prestado){
            for (int i = 0; i < librosPrestados.length; i++) {
                if (librosPrestados[i] == null) {
                    librosPrestados[i] = libro;
                    System.out.println("El libro " + libro.titulo + " ha sido prestado");
                    break;
                }
                if (i == librosPrestados.length - 1) {
                    System.out.println("No puedes prestar más libros");
                }
            }
            libro.prestarLibro();
        } else {
            System.out.println("El libro no está disponible");
        }
    }
    public void devolverLibroUsuario(String titulo) {
        for (int i = 0; i < librosPrestados.length; i++) {
            if (librosPrestados[i] != null && librosPrestados[i].titulo.equals(titulo)) {
                librosPrestados[i].devolverLibro();
                librosPrestados[i] = null;
                System.out.println("El libro " + titulo + " ha sido devuelto");
                break;
            }
            if (i == librosPrestados.length - 1) {
                System.out.println("No tienes prestado el libro " + titulo);
            }
        }
    }

}
