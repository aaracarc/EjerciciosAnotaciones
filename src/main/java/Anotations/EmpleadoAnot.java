package Anotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface EmpleadoAnot {
    EmpleadoAnot[] value();
    String nombre() default "VOID";
    String apellidos();
    String dni();
}
