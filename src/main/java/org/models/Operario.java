package org.models;

public abstract class Operario extends Empleado {
    public Integer codigoTaller;

    public Operario(String nombre, String apellidos, String direccion, String telefono, String dni, String clase, Integer codigoTaller) {
        super(nombre, apellidos, direccion, telefono, dni, clase);
        this.codigoTaller = codigoTaller;
    }
}
