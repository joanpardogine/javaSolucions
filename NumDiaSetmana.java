import java.util.Scanner;
import java.util.InputMismatchException;

public class NumDiaSetmana {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int numDiaSetmanaEntrat = 0;
        boolean esCorrecte = true;
        String[] diesDeLaSetmana = {"dilluns","dimarts","dimecres","dijous","divendres","dissabte","diumenge"};
        do {
            try {
                esCorrecte = true;
                System.out.print("Entra el número del dia de la setmana: ");
                numDiaSetmanaEntrat = teclat.nextInt();
                System.out.println("El nom del dia de la setmana " + numDiaSetmanaEntrat + " és " + diesDeLaSetmana[numDiaSetmanaEntrat-1]);
            } catch (InputMismatchException esUnaLletra) {
                System.out.println("Error!! Cal que entris un nombre enter!");
                System.out.println("És el següent error : " + esUnaLletra.getMessage());
                esCorrecte = false;
            } catch (ArrayIndexOutOfBoundsException noEstaDinsLimits){
                System.out.println("Error!! Cal que entris un nombre entre 1 i 7!");
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
