import java.util.Scanner;

public class NomEdat {
    /**
    * Fer un programa en java que demani a l’usuari el nom i l'edat i mostri per pantalla el següent missatge:
    Hola, et dius <nomEntrat> i tens <edatEntrada> anys

    on:
    <nomEntrat> és el nom que l’usuari ha introduït i
    <edatEntrada> és l’edat que l’usuari ha introduït.
    */
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        int edatEntrada;
        String nomEntrat;

        System.out.println("Entra el teu nom!");
        nomEntrat = teclat.next();
        
        System.out.println("Entra la teva edat!");
        edatEntrada = teclat.nextInt();
        
        System.out.print("Hola, et dius  " + nomEntrat + " i tens " + edatEntrada + " anys");

        teclat.close();
    }
}
