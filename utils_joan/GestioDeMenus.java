package utils_joan; // indiquem que es troba a una carpeta anomenada utils_joan

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author: Joan Pardo
 */
public class GestioDeMenus {
    
    // Atributs   --> No en té!
    
    // Constructor
    private GestioDeMenus(){
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
     * @param  vectorOpcions  Es tracta d'un vector que conté totes les opcions a mostrar.
     * @param  titol Cadena que s'imprimirà just abans del llistat del menú,
     *           com si fos el títol del menú.
     * @param  missatge Cadena que s'imprimirà després del llistat del menú,
     *           i just abans de les opcions.
     * @return  <pre>int</pre>
     *          Es tracta del valor que ha introduït l'usuari, en funció
     *              de la posició del menú que ha escollit.
     */
    public static int entraOpcioMenu(String[] vectorOpcions, String titol, String missatge) {
        Scanner teclat = new Scanner(System.in);
        int max = vectorOpcions.length;
        int min = 1;
        int opcioEscollida;
        opcioEscollida = -1;
        boolean esCorrecte;
        do {
            System.out.println(titol);
            mostraMenu(vectorOpcions);
            try {
                esCorrecte = true;
                System.out.print(missatge + " (1.." + max + "): ");
                opcioEscollida = teclat.nextInt();
                // if( (min<=opcioEscollida) && (opcioEscollida<=max)) {
                if ((min > opcioEscollida) || (opcioEscollida > max)) {
                    System.out.println("Error!! Cal que entris una de les opcions diponibles!");
                    esCorrecte = false;
                }
            } catch (InputMismatchException esUnaLletra) {
                System.out.println("Error!! Cal que entris un nombre enter!");
                esCorrecte = false;
            } finally {
                teclat = new Scanner(System.in); // Per "netejar" el "teclat"!
            }
        } while (!esCorrecte);
        teclat.close();
        return opcioEscollida;
    }

    private static void mostraMenu(String[] vectorOpcions) {
        for (int i = 0; i < vectorOpcions.length; i++) {
            System.out.println((i + 1) + " - " + vectorOpcions[i]);
        }
    }
}
