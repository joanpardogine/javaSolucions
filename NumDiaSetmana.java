import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * @author: Joan Pardo
 */
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


// dilluns = 1 dimarts = 2 dimecres = 3 dijous = 4 divendres = 5 dissabte = 6
// diumenge = 7

    // OPCIÓ A Amb if's
    // if (diaSetmana == 1) {
    // nomDiaSetmana = "dilluns";
    // } else {
    // if (diaSetmana == 2) {
    // nomDiaSetmana = "dimarts";
    // } else if (diaSetmana == 3) {
    // nomDiaSetmana = "dimecres";
    // } else if (diaSetmana == 4) {
    // nomDiaSetmana = "dijous";
    // } else if (diaSetmana == 5) {
    // nomDiaSetmana = "divendres";
    // } else if (diaSetmana == 6) {
    // nomDiaSetmana = "dissabte";
    // } else {
    // nomDiaSetmana = "diumenge";
    // }
    // }

    // OPCIÓ B Amb switch
    // switch (diaSetmana){
    // case 1:
    // nomDiaSetmana = "dilluns";
    // break;
    // case 2:
    // nomDiaSetmana = "dimarts";
    // break;
    // case 3:
    // nomDiaSetmana = "dimecres";
    // break;
    // case 4:
    // nomDiaSetmana = "dijous";
    // break;
    // case 5:
    // nomDiaSetmana = "divendres";
    // break;
    // case 6:
    // nomDiaSetmana = "dissabte";
    // break;
    // case 7:
    // nomDiaSetmana = "diumenge";
    // break;
    // // default: break;
    // }
    
    // System.out.println("El dia de la setmana és " + nomDiaSetmana);