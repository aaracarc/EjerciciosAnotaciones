package org.models;

public class Tecnico extends Operario {
    private static final String clase = "Tecnico";
    String perfil;

    public Tecnico(String nombre, String apellidos, String direccion, String telefono, String dni, Integer codigoTaller) {
        super(nombre, apellidos, direccion, telefono, dni, clase, codigoTaller);
    }
}
