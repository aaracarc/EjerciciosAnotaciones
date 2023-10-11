package org.utils;

import anotations.EmpleadoAnot;
import anotations.EmpleadosAnot;
import org.models.*;

public class UtilContexto {
    public static void cargadorDeContexto(Empresa empresa) {
        Class<? extends Empresa> empresaClass = empresa.getClass();

        // Se obtiene la anotacion
        EmpleadosAnot empleadosAnot = empresaClass.getAnnotation(EmpleadosAnot.class);

        //Si hay anotaciones que definan empleados
        if (empleadosAnot != null) {
            // Se obtienen el array de las anotaciones
            EmpleadoAnot[] empleadoAnotHijos = empleadosAnot.value();

            //Por cada anotacion se obtienen los valores correspondientes
            for (EmpleadoAnot empleadoAnotHijo : empleadoAnotHijos) {
                String nombre = empleadoAnotHijo.nombre();
                String apellidos = empleadoAnotHijo.apellidos();
                String dni = empleadoAnotHijo.dni();
                String clase = empleadoAnotHijo.clase();
                String direccion = empleadoAnotHijo.direccion();
                String telefono = empleadoAnotHijo.telefono();

                //Creacion inicial del objeto
                Empleado empleado = null;

                // Dependiendo de la clase se crea un tipo de empleado
                if ("Directivo".equals(clase)) {
                    empleado = new Directivo(nombre, apellidos, direccion, telefono, dni, 0);
                } else if ("Tecnico".equals(clase)) {
                    empleado = new Tecnico(nombre, apellidos, direccion, telefono, dni, 0);
                } else if ("Oficial".equals(clase)) {
                    empleado = new Oficial(nombre, apellidos, direccion, telefono, dni, 0 );
                }

                //Si se ha creado el objeto correctamente
                if (empleado != null) {
                    //Se aniade al conjunto de empleados
                    empresa.getEmpleadoset().add(empleado);
                }
            }
        }
    }
}
