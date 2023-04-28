/**  Resultats.java
 * Declara dues variables numèriques (amb el valor que desitgis) i
 * mostra per pantalla el resultat de la seva suma, la seva resta,
 * la seva multiplicació, la seva divisió i el mòdul (residu de la divisió).
*/

import java.util.Scanner;

/**
 * Resultats
 * @author Joan Pardo
 *
 */
public class Resultats {
    public static float operacio(int element1, int element2, char operador) {
        float resultat;
        resultat = 0.0f;

        if (operador == '+') {
            resultat = element1 + element2;
        } else if (operador == '-') {
            resultat = element1 - element2;
        } else if (operador == '*') {
            resultat = element1 * element2;
        } else {
            try {
                if (operador == '/') {
                    resultat = element1 / element2;
                } else {
                    resultat = element1 % element2;
                }
            } catch (Exception e) {
                if (operador == '/') {
                    resultat = -10000;
                } else {
                    resultat = -20000;
                }
            }
        }
        return resultat;
    }

    public static void main(String[] args) {
        int num1;
        int num2;
        float resultat;
        char respostaSortir;
        boolean volsSortir;

        volsSortir = false;
        respostaSortir = 'n';

        Scanner teclat = new Scanner(System.in);

        String[] vectorText = { "La suma", "La resta", "El producte", "La divisió", "El mòdul" };
        char[] vectorOperadors = { '+', '-', '*', '/', '%' };
        do{
            System.out.print("Entra el primer dels números: ");
            num1 = teclat.nextInt();
            
            System.out.print("Entra el segon dels números: ");
            num2 = teclat.nextInt();
            
            for (int i = 0; i < vectorOperadors.length; i++) {
                resultat = operacio(num1, num2, vectorOperadors[i]);
                if ((resultat == -10000) || (resultat == -20000)) {
                    System.out.println("No es pot dividir per zero!");
                } else {
                    System.out.println(vectorText[i] + " " + num1 + " i " + num2 + " és: " + resultat);
                }
            }

            System.out.print("Vols sortir (s/n)?: ");
            respostaSortir = teclat.next().charAt(0);
            respostaSortir = Character.toLowerCase(respostaSortir);
            if(respostaSortir == 's'){
                volsSortir = true;
            }
        }while (!(volsSortir));

        /* Segona versió amb la funció operacio */
        // char op = '+';
        // resultat = operacio(num1, num2, op);
        // System.out.println("La suma de " + num1 + " i " + num2 + " és: " + resultat);
        
        // op = '-';
        // resultat = operacio(num1, num2, op);
        // System.out.println("La resta de " + num1 + " i " + num2 + " és: " + resultat);

        // op = '*';
        // resultat = operacio(num1, num2, op);
        // System.out.println("La producte de " + num1 + " i " + num2 + " és: " + resultat);

        // op = '/';
        // resultat = operacio(num1, num2, op);
        // System.out.println("La divisió de " + num1 + " i " + num2 + " és: " + resultat);

        // op = '%';
        // resultat = operacio(num1, num2, op);
        // System.out.println("El mòdul de " + num1 + " i " + num2 + " és: " + resultat);
        /* Segona versió amb la funció operacio */

        /* Primera versió */
        //     resultat = num1 + num2;
        //     resultat = num1 - num2;
        //     System.out.println("La resta de " + num1 + " i " + num2 + " és: " + resultat);
        //     resultat = num1 * num2;
        //     System.out.println("El producte de " + num1 + " i " + num2 + " és: " + resultat);
        //     try {
        //         resultat = num1 / num2;
        //         System.out.println("La divisió de " + num1 + " i " + num2 + " és: " + resultat);
        //     } catch (Exception errorRebut) {
        //         System.out.println("No es pot dividir per zero!");
        //         System.out.println("Hi hagut el següent error " + errorRebut.getMessage());
        //     }
        //     try {
        //         resultat = num1 % num2;
        //         System.out.println("El mòpdul de " + num1 + " i " + num2 + " és: " + resultat);
        //     } catch (Exception errorRebut) {
        //         System.out.println("No es pot dividir per zero!");
        //         System.out.println("Hi hagut el següent error " + errorRebut.getMessage());
        //     }
        // }
        /* Primera versió */
        teclat.close();
    }
}
