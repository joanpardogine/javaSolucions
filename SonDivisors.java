import java.util.Scanner;

public class SonDivisors {
    /** * Fer un programa que donats dos nombres a i b que l’usuari ingressi per 
     * teclat digui si a és un divisor de b. Cal comprovar que tant a com b són
     * enters positius; en cas contrari s’ha de donar un error. 
    */
    static Scanner teclat = new Scanner(System.in);

    public static boolean esDivisor(int a, int b) {
        boolean siQueEsDivisor;
        siQueEsDivisor = false;
        if (b % a == 0) {
            siQueEsDivisor = true;
        }
        return siQueEsDivisor;
    }

    public static int llegeixEnterPositiu(String missatge) {
        int valorLlegit = -1;
        boolean positiu = false;
        do {
            System.out.print(missatge);
            try {
                valorLlegit = teclat.nextInt();
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
        int a;
        int b;

        a = llegeixEnterPositiu("Entra el valor de a: ");
        b = llegeixEnterPositiu("Entra el valor de b: ");

        if (esDivisor(a, b)) {
            System.out.println(a + " és divisor de " + b);
        } else {
            System.out.println(a + " NO és divisor de " + b);
        }
    }
}
