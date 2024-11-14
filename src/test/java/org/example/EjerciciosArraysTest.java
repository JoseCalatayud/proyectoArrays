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
        String[] frutas2 = { "patata", "manzana", "pera", "melon", "sandia", "ciruela", "patata", "patata" };
        String[] resultado = { "patata", "patata", "patata", "pera" };
        assertArrayEquals(resultado, cut.encontrarComunesEnArray(frutas1, frutas2));

    }@Test
    public void encontrarComunesEnArrayBisTest() throws Exception {

        String[] frutas1 = { "patata", "cereza", "naranja", "pera" };
        String[] frutas2 = { "patata", "manzana", "pera", "melon", "sandia", "ciruela", "patata", "patata" };
        String[] resultado = { "patata", "pera" };
        assertArrayEquals(resultado, cut.encontrarComunesEnArrayBis(frutas1, frutas2));

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
        assertThrows(Exception.class, () -> cut.encontrarComunesEnArray(frutas1, frutas2));
    }

    @Test
    public void encontrarSegundoMasPequenioTest() {
        double[] muestra = { 4, 4, 4, 2, 2 };
        assertTrue(cut.encontrarSegundoMasPequenio(muestra) == 4);
    }

    @Test
    void testCompararArreglos() throws Exception {
        int[] primerArreglo = { 1, 2, 3, 4 };
        int[] segundoArreglo = { 1, 2, 3, 4 };
        assertTrue(cut.compararArreglos(primerArreglo, segundoArreglo));
    }

}
