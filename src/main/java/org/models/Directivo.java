package org.models;

public class Directivo extends Empleado{
    private static final String clase = "Directivo";
    public Integer codigoDespacho;

    /**Constructor Directivo
     * @param nombre nombre
     * @param apellidos apellidos
     * @param direccion direccion
     * @param telefono telefono
     * @param dni dni
     * @param codigoDespacho codigoDespacho
     */
    public Directivo(String nombre, String apellidos, String direccion, String telefono, String dni, Integer codigoDespacho) {
        super(nombre, apellidos, direccion, telefono, dni, clase);
        this.codigoDespacho = codigoDespacho;
    }
}
