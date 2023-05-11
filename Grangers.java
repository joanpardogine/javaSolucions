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
        }
    }


    public static float llegeixFloat(String missatge) {
        float valorLlegit = -1;
        boolean positiu = false;
        do {
            System.out.print(missatge);
            try {
                valorLlegit = teclat.nextFloat();
                if (valorLlegit < 0) {
                    System.out.println("ERROR!!! Només pots entrar positius!!");
                    positiu = false;
                } else {
                    positiu = true;
                }
            } catch (Exception e) {
                System.out.println("ERROR!!! Només pots entrar enters!!");
            } finally {
                teclat = new Scanner(System.in);
            }
        } while (!positiu);
        return valorLlegit;
    }

    public static void main(String[] args) {
        int opcioEntrada = -1;
        int preuEscollit;
        float qtatHectarees;
        float importBasic;
        float importFinal;
        float import1rDte;
        float import2nDte;
        import1rDte = 0.0f;
        import2nDte = 0.0f;

        float dtePerHectarees;
        dtePerHectarees = 0.05f;  // 5% = 0.05
        float dtePerMes10000;
        dtePerMes10000 = 0.10f;   // 10% = 0.10

        opcioEntrada = entraOpcioMenu();
        qtatHectarees = llegeixFloat("Entra la quantitat d'Hectàrees: ");
        System.out.println("Has entrat " + qtatHectarees + " hectàrees.");
        preuEscollit = Integer.parseInt(preuFumigacions[opcioEntrada-1][1]);
        importBasic = qtatHectarees * preuEscollit;

        if (qtatHectarees>100){
            import1rDte = importBasic * dtePerHectarees;
            System.out.println("Tens un descomte de " + dtePerHectarees + " per entrar més de 100 hectàrees.");
            System.out.println("Descomte = " + import1rDte);
        }

        System.out.println("Has ecollit l'opció " + preuFumigacions[opcioEntrada-1][0] + " és a dir " + preuEscollit + "euro/hectàrea.");
        System.out.println("De moment tens un import bàsic de " + importBasic);

        if (importBasic>10000){
            import2nDte = (10000-importBasic) * dtePerMes10000;
            System.out.println("Tens un descomte de " + dtePerMes10000 + " perquè l'import és superior a 10000 Euros.");
            System.out.println("Descomte = " + import2nDte);
        }

        System.out.println("L'import final és " + (importBasic - import1rDte - import2nDte)); 

    }
}
