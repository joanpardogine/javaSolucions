/**
 * @author Joan Pardo
 *
 */
public class Hipotenusa {
    
public static void main(String[] args) {
    /**
     * Fer un programa que donat la base i l’altura d’un
     * triangle rectangle, calculi la seva hipotenusa i
     * la mostri per pantalla.
     */

     int base = 3;
     int alssada = 2;
     double hipotenusa;
     hipotenusa = Math.sqrt(base^2+alssada^2);
     System.out.print("La hipotenusa és: " + hipotenusa);
}


}
