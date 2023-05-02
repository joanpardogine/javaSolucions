import java.util.InputMismatchException;
import java.util.Scanner;

public class NomMes {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int numMesEntrat = 0;
        boolean esCorrecte = true;
        String[] nomMesos = {"gener","febrer","març","abril","maig","juny","juliol","agost","setembre","octubre","novembre","desembre"};
        do {
            try {
                esCorrecte = true;
                System.out.print("Entra el número del mes de l'any: ");
                numMesEntrat = teclat.nextInt();
                System.out.println("El nom del mes de l'any " + numMesEntrat + " és " + nomMesos[numMesEntrat-1]);
            } catch (InputMismatchException esUnaLletra) {
                System.out.println("Error!! Cal que entris un nombre enter!");
                System.out.println("És el següent error : " + esUnaLletra.getMessage());
                esCorrecte = false;
            } catch (ArrayIndexOutOfBoundsException noEstaDinsLimits){
                System.out.println("Error!! Cal que entris un nombre entre 1 i 12!");
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
