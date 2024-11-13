package org.example;

public class EjerciciosArrays {

    public int encontrarComunesEnArray(String [] lista1, String[] lista2) throws Exception{
        if (lista1.length==0 || lista2.length==0){
            throw new Exception("Los arrays no puedes estar vacios");
        }
        
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
