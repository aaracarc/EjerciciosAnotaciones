package org.ejercicios;

import Anotations.EmpleadoAnot;

import java.util.HashSet;
import java.util.Set;

@EmpleadoAnot(nombre = "Amancio", apellidos = "Ortega", dni = "66554433F", clase = "Directivo")
@EmpleadoAnot(nombre = "Rosa", apellidos = "Jimenez", dni = "112233B", clase = "Tecnico")
@EmpleadoAnot(nombre = "Manuel", apellidos = "Gonzalez", dni = "778899N", clase = "Oficial")

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