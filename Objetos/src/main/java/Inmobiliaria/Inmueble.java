package Inmobiliaria;

public abstract sealed class Inmueble permits Local, Vivienda{
    private int identificador;
    private String direccion;
    private double precio;
    private double superficie;

    public Inmueble() {
    }

    public Inmueble(int identificador, String direccion, double precio, double superficie) {
        this.identificador = identificador;
        this.direccion = direccion;
        this.precio = precio;
        this.superficie = superficie;
    }

    @Override
    public String toString() {
        return "Inmueble{" +
                "identificador=" + identificador +
                ", direccion='" + direccion + '\'' +
                ", precio=" + precio +
                ", superficie=" + superficie +
                '}';
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
}
