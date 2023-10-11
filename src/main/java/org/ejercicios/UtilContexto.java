package org.ejercicios;

import Anotations.EmpleadoAnot;

public class UtilContexto {
    public static void cargadorDeContexto(Empresa empresa){
        EmpleadoAnot empleadoAnotPadre = empresa.getClass().getAnnotation(EmpleadoAnot.class);
        EmpleadoAnot[] empleadoAnotHijos = empleadoAnotPadre.value();

        for (EmpleadoAnot empleadoAnotHijo: empleadoAnotHijos
        ) {
            String nombre = empleadoAnotHijo.nombre();
            String apellidos = empleadoAnotHijo.apellidos();
            String dni = empleadoAnotHijo.dni();

            empresa.getEmpleadoset().add(new Empleado(nombre, apellidos, dni));
        }
    }
}
