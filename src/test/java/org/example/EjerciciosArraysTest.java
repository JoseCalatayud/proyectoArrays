package org.example;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class EjerciciosArraysTest {
    EjerciciosArrays cut = new EjerciciosArrays();

    @Test
    /**
     * 
     * @throws Exception No se espera el fallo es para controlar el envio de un
     *                   array vacio
     */
    public void encontrarComunesEnArrayTest() throws Exception {

        String[] frutas1 = { "patata", "cereza", "naranja", "pera" };
        String[] frutas2 = { "patata", "manzana", "pera", "melon", "sandia", "ciruela" };
        String[] resultado = { "patata", "pera" };
        assertArrayEquals(resultado, cut.encontrarComunesEnArray(frutas1, frutas2));

    }
    @Test
    public void encontrarComunesEnArray_ArrayVacio() throws Exception {
        String[] frutas1 = {};
        String[] frutas2 = { "patata", "manzana", "pera", "melon", "sandia", "ciruela" };
        String[] resultado = {};
        assertArrayEquals(resultado, cut.encontrarComunesEnArray(frutas1, frutas2));
    }
    @Test
    public void encontrarComunesEnArray_ArrayNulo() throws Exception {
        String[] frutas1 = null;
        String[] frutas2 = { "patata", "manzana", "pera", "melon", "sandia", "ciruela" };
        assertThrows(Exception.class, ()-> cut.encontrarComunesEnArray(frutas1, frutas2));
    }
    @Test
    public void encontrarSegundoMasPequeñoTest () {
        double [] muestra = {-212,-1114,5,65,-1,-7,-7,10}; 
        assertTrue(cut.encontrarSegundoMasPequeño(muestra)==-212);
    }
    @Test
    void testCompararArreglos() {
        int [] primerArreglo = {1,2,3,4};
        int [] segundoArreglo = {1,2,3,4};
        assertTrue(cut.compararArreglos(primerArreglo, segundoArreglo));
    }

    
}
