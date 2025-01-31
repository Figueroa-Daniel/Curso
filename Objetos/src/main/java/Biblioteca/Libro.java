package Biblioteca;

public class Libro {
    public String titulo;
    public String autor;
    public String fechaPublicacion;
    public String género;
    public boolean disponible = true;

    public Libro(String titulo, String autor, String fechaPublicacion, String género) {
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.género = género;
    }
    public void prestarLibro(){
        disponible = false;
    }
    public void devolverLibro(){
        disponible = true;
    }
    public boolean comprobarDisponibilidad(){
        return disponible;
    }

}
