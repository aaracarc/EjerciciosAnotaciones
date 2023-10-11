package org.models;

import anotations.EmpleadoAnot;

import java.util.HashSet;
import java.util.Set;

//Datos de empleados
@EmpleadoAnot(nombre = "Amancio", apellidos = "Ortega", direccion = "calle hola", telefono = "623456789", dni = "66554433F", clase = "Directivo")
@EmpleadoAnot(nombre = "Rosa", apellidos = "Jimenez", direccion = "calle adios", telefono = "632654987", dni = "112233B", clase = "Tecnico")
@EmpleadoAnot(nombre = "Manuel", apellidos = "Gonzalez", direccion = "calle quetal", telefono = "6789456123", dni = "778899N", clase = "Oficial")

public class Empresa {
    private Set<Empleado> empleadoset = new HashSet<>();

    public Empresa(){}

    public Set<Empleado> getEmpleadoset() {
        return empleadoset;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "empleadoset=" + empleadoset +
                '}';
    }
}