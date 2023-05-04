/**
 * @author: Joan Pardo
 * Fer un programa que escrigui els nombres senars del 1000 al 2000.
 * NO es pot fer servir, la sentencia for.
 */

public class MostrarSenarsDel1000Al2000V2 {

    public static void main(String[] args) {
        for (int comptador = 1000; comptador < 2000; comptador++) {
            if (comptador%2 != 0) {
                System.out.println(comptador);
            }
        }
        // int comptador = 1000;
        // do {
        //     if (comptador%2 != 0) {
        //         System.out.println(comptador);
        //     }
        //     comptador++;
        // } while (comptador <= 2000);
    }
}
