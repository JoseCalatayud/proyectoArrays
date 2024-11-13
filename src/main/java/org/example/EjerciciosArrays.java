package org.example;

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
        return listaComunes;
    }

    public double encontrarSegundoMasPequeño(double[] arreglo) throws NullPointerException {
        double masPequenio = arreglo[0];
        double segundoMasPequenio = Double.MAX_VALUE;
        for (double numero : arreglo) {
            if (masPequenio > numero) {
                masPequenio = numero;
            }
        }
        for (double d : arreglo) {
            if (segundoMasPequenio > d && d != masPequenio) {
                segundoMasPequenio = d;
            }
        }
        return segundoMasPequenio;
    }

}
