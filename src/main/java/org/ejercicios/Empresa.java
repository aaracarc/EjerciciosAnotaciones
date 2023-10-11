package org.ejercicios;

import Anotations.EmpleadoAnot;

import java.util.HashSet;
import java.util.Set;

@EmpleadoAnot(
        value = {}, nombre = "Amancio", apellidos = "Ortega", dni = "66554433F")
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