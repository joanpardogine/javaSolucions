package utils_joan;

import java.util.Scanner;

public class Llegir {
    static Scanner teclat = new Scanner(System.in);

    // Constructor
    public Llegir(){
        // Una IllegalStateException és una excepció en
        // temps d'execució a Java que es llança per indicar
        // que s'ha invocat un mètode en el moment equivocat.
        // Aquesta excepció s'utilitza per indicar que es
        // crida un mètode en un moment il·legal o inadequat.
        throw new IllegalStateException("No es pot instanciar aquesta Classe.");
    }

    public static int enterPositiu(String missatge){
        boolean positiu = false;
        int valorLlegit = -1;
        do{
            System.out.print(missatge);
            try {
                valorLlegit = teclat.nextInt();
                if(valorLlegit<0){
                    System.out.println("ERROR!!! Només pots entrar positius!!");
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
    
    public static int enterPositiuInterval(String missatge, int valorMinim, int valorMaxim){
        int valorLlegit;
        do{
            valorLlegit = enterPositiu(missatge);
            if (valorMinim > valorLlegit || valorLlegit > valorMaxim){
                System.out.println("ERROR!!! Només pots entrar nombres dins de l'interval " + valorMinim + ".." + valorMaxim + "!");
            }
        } while (valorMinim > valorLlegit || valorLlegit > valorMaxim);
        return valorLlegit;

    }


}
