import java.util.InputMismatchException;
import java.util.Scanner;

public class NomMesIdioma {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int numMesEntrat = 0;
        int idiomaEntrat = 0;
        boolean esCorrecte = true;
        String[][] nomMesos = {
            {"gener","febrer","març","abril","maig","juny","juliol","agost","setembre","octubre","novembre","desembre"},
            {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"},
            {"January","February","March","April","May","June","July","August","September","October","November","December"},
            {"Janvier","Février","Mars","Avril","Mai","Juin","Juillet","Août","Septembre","Octobre","Novembre","Décembre"}
        };

        do {
            try {
                esCorrecte = true;
                System.out.print("Entra el número del mes de l'any: ");
                numMesEntrat = teclat.nextInt();
                System.out.print("Entra l'idioma en que ho vols (1: català, 2: castellà, 3: anglès, 4: francès): ");
                idiomaEntrat = teclat.nextInt();
                System.out.println("El nom del mes de l'any " + numMesEntrat + " és " + nomMesos[idiomaEntrat-1][numMesEntrat-1]);
            } catch (InputMismatchException esUnaLletra) {
                System.out.println("Error!! Cal que entris un nombre enter!");
                System.out.println("És el següent error : " + esUnaLletra.getMessage());
                esCorrecte = false;
            } catch (ArrayIndexOutOfBoundsException noEstaDinsLimits){
                System.out.println("Error!! Cal que entris un nombre entre 1 i 12 pels mesos i un nombre entre 1 i 4 per l'idioma!");
                System.out.println("És el següent error : " + noEstaDinsLimits.getMessage());
                esCorrecte = false;
            }
            finally{
                // Per "netejar" el "teclat"!
                teclat = new Scanner(System.in);
            }
        } while(!esCorrecte);
        teclat.close();        
    }
}
