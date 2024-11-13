package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class EjerciciosArraysTest {
    EjerciciosArrays cut = new EjerciciosArrays();
    
    @Test
    public void encontrarComunesEnArrayTest() throws Exception {

        String [] frutas1 = {"patata","manzana","naranja","pera"};
        String [] frutas2 = {"patata","manzana","naranja","pera", "melon", "sandia", "cereza"};
        assertEquals(4, cut.encontrarComunesEnArray(frutas1, frutas2));
    }
    @Test
    public void esTrue(){
        assertTrue(true);
    }
}
