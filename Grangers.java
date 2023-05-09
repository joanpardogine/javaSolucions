import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Una companyia de fumigació utilitza avions per a fumigar els
 * camps contra una gran varietat de plagues. Les quantitats que
 * la companyia cobra als grangers depèn de què és el que es
 * desitja fumigar i del nombre d'hectàrees que es desitja fumigar,
 * d'acord amb la següent distribució:
 * -  fumigació contra males herbes, 50 € per hectàrea.
 * -  fumigació contra mosques i mosquits, 70 € per hectàrea.
 * -  fumigació contra cucs, 80 € per hectàrea.
 * -  fumigació contra tots els tipus anteriors, 190 € per hectàrea.
 * Si l'àrea a fumigar és més gran de 100 hectàrees, el granger gaudirà
 * d'un 5% de descompte. A més a més, si el compte total és més gran de
 * 10.000 €, gaudirà d'un 10% de descompte sobre la quantitat que
 * sobrepassi als 10.000 €.
 * Desenvolupa programa en java que llegeixi el nom del granger, el tipus
 * de fumigació sol·licitada (1-4) i el nombre d'hectàrees a fumigar.
 * Suposa que es llegeixen les dades de 50 grangers. Per cada granger s'ha de
 * visualitzar per pantalla el seu nom i el compte total. Al final, amb la
 * informació recollida dels 50 grangers, s'ha d'imprimir el nombre de
 * fumigacions de cada tipus i l'import total de vendes.
 */
public class Grangers {
    static Scanner teclat = new Scanner(System.in);

    static String preuFumigacions[][] = {
        {"males herbes","50"},
        {"mosques i mosquits","70"},
        {"cucs","80"},
        {"escarbats","45"},
        {"tots els tipus anteriors","190"}};

    static int entraOpcioMenu(){
        int max = preuFumigacions.length;
        int min = 1;
        int opcioEscollida;
        opcioEscollida = -1;
        boolean esCorrecte;
        do {
            mostraMenu();
            try {
                esCorrecte = true;
                System.out.print("Entra una de les següents opcions (1.." + max + "): ");
                opcioEscollida = teclat.nextInt();
                // if( (min<=opcioEscollida) && (opcioEscollida<=max)) {
                if ((min > opcioEscollida) || (opcioEscollida > max)) {
                    System.out.println("Error!! Cal que entris una de les opcions diponibles!");
                    esCorrecte = false;
                }
            } catch (InputMismatchException esUnaLletra) {
                System.out.println("Error!! Cal que entris un nombre enter!");
                esCorrecte = false;
            }
            finally{
                // Per "netejar" el "teclat"!
                teclat = new Scanner(System.in);
            }
        } while(!esCorrecte);
        return opcioEscollida;
    }

    static void mostraMenu(){
        System.out.println();
        System.out.println("MENU FUMIGACIÓ");
        for (int i = 0; i < preuFumigacions.length; i++) {
            System.out.println("Tipus " + (i+1) +
            ": Fumigació contra " + preuFumigacions[i][0] + ", " +
            preuFumigacions[i][1] + " Euros per hectàrea.");
        };
        }

    public static void main(String[] args) {
        int opcioEntrada = -1;
        float qtatHectarees = -1;
        opcioEntrada = entraOpcioMenu();
        System.out.print("Entra la quantitat d'Hectàrees: ");
        qtatHectarees = teclat.nextFloat();
        System.out.println("Has ecollit l'opció " + preuFumigacions[opcioEntrada-1][0]);
        System.out.println("Has entrat " + qtatHectarees + " hectàrees.");
        System.out.println("L'import final és " + (qtatHectarees * Integer.parseInt(preuFumigacions[opcioEntrada-1][1])) ); 

    }
}
