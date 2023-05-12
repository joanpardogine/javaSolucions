import java.util.Scanner;
import utils_joan.Llegir;


public class ControlFesta {
    // A una festa assisteixen persones de diferents edats i sexe. Desenvolupa programa en java que,
    // donades les edats i el sexe (HOME-DONA-ALTRE) de les persones assistents, calculi:
    // *) Nombre total de persones que assisteixen a la festa.
    // *) Nombre total d'homes, dones i altres.
    // *) Mitjana de les edats per sexe.
    // *) Edat de la persona més jove i la més vella.
    // S'ha de tenir en compte que no es permet l'entrada a menors d'edat i s'ha de controlar que
    // l'usuari s'equivoca i introdueixi edats negatives, li aparegui un missatge d'error.
    // El programa anirà demant dades fins que es llegeixi una edat igual a 0.
    // Cal fer servir una constant amb el nom MAJOR_EDAT.

    public enum Sexe {
        HOME, DONA, ALTRE
    }

    static Scanner teclat = new Scanner(System.in);

   public static void main(String[] args) {
    int edatEntrada = 0;
    do{
        edatEntrada = Llegir.enterPositiu("Entra l'edat de la persona: ");
        if(edatEntrada!=0){
            System.out.println("has entrat l'edat " + edatEntrada);
        } else {
            System.out.println("Adeu!");
        }

    } while (edatEntrada!=0);
   }
}
