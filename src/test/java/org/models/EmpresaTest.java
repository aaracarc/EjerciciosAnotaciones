package org.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.utils.UtilContexto;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {
    private Empresa empresa;

    //Antes de cada test
    @BeforeEach
    public void setUp() {
        empresa = new Empresa();
        UtilContexto.cargadorDeContexto(empresa);
    }

    @Test
    public void testTresEmpleadosDiferentes() {
        Set<Empleado> empleados = empresa.getEmpleadoset();
        //3 empleados creados
        assertEquals(3, empleados.size());

        boolean directivoEncontrado = false;
        boolean tecnicoEncontrado = false;
        boolean oficialEncontrado = false;

        //Se busca que ese empleado sea del tipo requerido
        for (Empleado empleado : empleados) {
            if (empleado instanceof Directivo) {
                directivoEncontrado = true;
            } else if (empleado instanceof Tecnico) {
                tecnicoEncontrado = true;
            } else if (empleado instanceof Oficial) {
                oficialEncontrado = true;
            }
        }

        //Se comprueba que los 3 se hayan encontrado
        assertTrue(directivoEncontrado);
        assertTrue(tecnicoEncontrado);
        assertTrue(oficialEncontrado);
    }
}