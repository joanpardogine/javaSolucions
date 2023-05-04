import java.util.Scanner;

import javax.swing.tree.TreeCellEditor;

/**
 * @author: Joan Pardo
 * Escriure un programa que donats dos nombres a i b, que l’usuari ingressi per teclat,
 * calculi ab. S’ha de comprovar que tant a com b són enters positius, si no es compleix,
 * cal donar un error. Cal crear una funció entraPositiu, que retorni un enter positiu.
 */
public class ElevarNombre {

    static Scanner teclat = new Scanner(System.in); // Global
    
    public static int entraPositiu(){
        int valorLlegit = -1;
        boolean positiu = false;
        do{
            try {
                valorLlegit = teclat.nextInt();
                if(valorLlegit<0){
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
        // Scanner teclat = new Scanner(System.in);
        int base;
        int potencia;

        System.out.print("Entra la base: ");
        base = entraPositiu();

        System.out.print("Entra la potencia: ");
        potencia = entraPositiu();

        System.out.println(base + " elevat a " + potencia + " és igual a " + Math.pow(base, potencia));

    }
}
