package org.example;

public class EjerciciosArrays {

    public int encontrarComunesEnArray(String [] lista1, String[] lista2){
        int longitudArreglo = (lista1.length >=lista2.length) ? lista1.length : lista2.length;
        String [] listaComunes = new String[longitudArreglo];
        int numeroComunes = 0;
        for (String elemento1 : lista1) {
            for (String elemento2 : lista2) {
                if (elemento2.equals(elemento1)) {
                    numeroComunes++;

                }
            }
        }
        return numeroComunes;
    }

}
