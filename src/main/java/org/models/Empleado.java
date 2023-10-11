package org.models;

public abstract class Empleado {
    //Atributos
    private String nombre;
    private String apellidos;
    private String direccion;
    private String telefono;
    private String dni;
    private String clase;

    //Constructores
    public Empleado(){}

    /** Constructor Empleado
     * @param nombre nombre
     * @param apellidos apellidos
     * @param direccion direccion
     * @param telefono telefono
     * @param dni dni
     * @param clase clase
     */
    public Empleado(String nombre, String apellidos, String direccion, String telefono, String dni, String clase) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dni = dni;
        this.clase = clase;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDni() {
        return dni;
    }

    public String getClase() {
        return clase;
    }
}
