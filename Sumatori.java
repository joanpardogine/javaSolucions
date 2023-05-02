import java.util.Scanner;

public class Sumatori {

        
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int numero, resultat = 0;

        System.out.print("Introdueix el número: ");
        numero = teclat.nextInt();
        // for (int i = 1; i <= numero; i++) { // 1 + 2 + 3 + 4 + 5
        for (int i = numero; i >= 1; i--) { // 5 + 4 + 3 + 2 + 1
            resultat = resultat + i;
        }

        System.out.print("El factorial del número és: " + resultat);
        teclat.close();
    }

}
