package org.ejercicios;

public class Empleado {
    private String nombre;
    private String apellidos;
    private String direccion;
    private Integer telefono;
    private String dni;

    public Empleado(){}
    public Empleado(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }
}
