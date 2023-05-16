package utils_joan;


public class Dates {
    // Atributs   --> No en té!
    
    // Constructor
    private Dates() {
        // Una IllegalStateException és una excepció en
        // temps d'execució a Java que es llança per indicar
        // que s'ha invocat un mètode en el moment equivocat.
        // Aquesta excepció s'utilitza per indicar que es
        // crida un mètode en un moment il·legal o inadequat.
        throw new IllegalStateException("No es pot instanciar aquesta Classe.");
    }
    
    // Setters i Getters    --> No en té ja que no té atributs!!
    // Mètodes
    /**
     * @author Joan Pardo
     * @param  esDeTrespas
     * @return  True o Fals
     *    Es tracta d'avaluar si el valor rebut com a un any, és un any de traspas o no.
     */
    public static boolean esDeTrespas(int anyAAvaluar) {
        //  si any mòdul 400 és 0
        //      any de traspàs
        //  si no 
        //    si (any mòdul 4 == 0) && (any mòdul 100 != 0)
        //        any de traspàs
        //    fi si
        //  fi si

    boolean hoEs = false;
        if (anyAAvaluar%400==0){
            hoEs = true;
        } else {
            if ((anyAAvaluar % 4 == 0) && (anyAAvaluar % 100 != 0)) {
                hoEs = true;
            }
        }
        return hoEs;
    }

}
