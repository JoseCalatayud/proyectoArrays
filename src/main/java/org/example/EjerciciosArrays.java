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

}
