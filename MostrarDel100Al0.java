/**
 * @author: Joan Pardo
 * Fer un programa en Java que mostri els nombres del 100 al 0.
 * Només es pot fer servir, la sentencia for.
 */
public class MostrarDel100Al0 {
    public static void main(String[] args) {
        // for (int i = 100; i <= 0; i--) { // incorrecte !!!
        for (int i = 100; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
