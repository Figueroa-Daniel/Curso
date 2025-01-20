package Inmobiliaria;

import java.util.Objects;

public final class Local extends Inmueble {
    public boolean salidaHumos;
    public Local(){}
    public Local(int identificador, String direccion, double precio, double superficie, boolean salidaHumos) {
        super(identificador, direccion, precio, superficie);
        this.salidaHumos = salidaHumos;
    }

    public boolean isSalidaHumos() {
        return salidaHumos;
    }

    public void setSalidaHumos(boolean salidaHumos) {
        this.salidaHumos = salidaHumos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Local local = (Local) o;
        return salidaHumos == local.salidaHumos;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(salidaHumos);
    }


}
