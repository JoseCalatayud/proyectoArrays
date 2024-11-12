package org.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EjerciciosArraysTest {
    EjerciciosArrays cut = new EjerciciosArrays();
    @Test
    public void encontrarComunesEnArrayTest() {

        String [] frutas1 = {"patata","manzana","naranja","pera"};
        String [] frutas2 = {"patata","manzana","naranja","pera", "melon", "sandia", "cereza"};
        assertEquals(4, cut.encontrarComunesEnArray(frutas1, frutas2));
    }
}
