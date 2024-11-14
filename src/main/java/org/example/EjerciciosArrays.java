package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class EjerciciosArrays {

    public String[] encontrarComunesEnArray(String[] lista1, String[] lista2) throws NullPointerException {

        // if (lista1.equals(null) || lista2.equals(null)) {

        // }

        int numeroComunes = 0;
        for (String elemento1 : lista1) {
            for (String elemento2 : lista2) {
                if (elemento2.equals(elemento1)) {
                    numeroComunes++;

                }
            }
        }

        String[] listaComunes = new String[numeroComunes];
        int contador = 0;
        for (String elemento1 : lista1) {
            for (String elemento2 : lista2) {
                if (elemento2.equals(elemento1)) {
                    listaComunes[contador++] = elemento2;

                }
            }
        }
        int elementosUnicos = 0;
        boolean noExiste = true;
        for (String string : lista1) {
            for (String string2 : listaComunes) {
                if (string.equals(string2) && noExiste) {
                    elementosUnicos++;
                }
            }
        }
        // String [] resultadoFinal;
        // if(elementosUnicos==listaComunes.length){
        // resultadoFinal = listaComunes;
        // }
        // noExiste = true;
        // for (int i = 0; i < elementosUnicos; i++) {

        // }

        return listaComunes;
    }

    public String[] encontrarComunesEnArrayBis(String[] lista1, String[] lista2) throws Exception {
        if (lista1 == null) {
            throw new Exception();
        }

        if (lista2 == null) {
            throw new Exception();
        }
        ArrayList<String> resultados = new ArrayList<>();

        for (String elementoLista1 : lista1) {
            for (String elementoLista2 : lista2) {
                if (elementoLista1.equals(elementoLista2) && !resultados.contains(elementoLista1)) {
                    resultados.add(elementoLista1);
                }
            }
        }
        String [] resultadosArray = new String [resultados.size()];
        for (int i = 0; i < resultadosArray.length; i++) {
            resultadosArray[i]=resultados.get(i);
        }
        return resultadosArray;

    }

    public double encontrarSegundoMasPequeño(double[] arreglo) throws NullPointerException {
        double masPequenio = Double.MAX_VALUE;
        double segundoMasPequenio = Double.MAX_VALUE;
        for (double numero : arreglo) {
            if (masPequenio > numero) {
                segundoMasPequenio = masPequenio;
                masPequenio = numero;
            }
            if (segundoMasPequenio > numero && numero != masPequenio) {
                segundoMasPequenio = numero;
            }
        }

        return segundoMasPequenio;
    }

    public boolean compararArreglos(int[] primerArreglo, int[] segundoArreglo) {

        if (primerArreglo == null && segundoArreglo == null
                || primerArreglo.length == 0 && segundoArreglo.length == 0) {
            return true;
        }
        if (primerArreglo.length != segundoArreglo.length) {
            return false;
        }
        for (int i = 0; i < segundoArreglo.length; i++) {
            if (primerArreglo[i] != segundoArreglo[i]) {
                return false;
            }
        }
        return true;
    }

}
