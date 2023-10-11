package org.models;

public class Oficial extends Operario{
    private static final String clase = "Oficial";
    public String categoria;

    public Oficial(String nombre, String apellidos, String direccion, String telefono, String dni, Integer codigoTaller) {
        super(nombre, apellidos, direccion, telefono, dni, clase, codigoTaller);
    }
}
