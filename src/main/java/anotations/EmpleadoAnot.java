package anotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(EmpleadosAnot.class)
public @interface EmpleadoAnot {
    //Atributos
    String nombre() default "VOID";
    String apellidos();
    String direccion();
    String telefono();
    String dni();
    String clase();
}
