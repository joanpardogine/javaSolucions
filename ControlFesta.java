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

    static Scanner teclat = new Scanner(System.in);
    
    static final int MAJOR_EDAT = 18;

    public static enum Sexe {
        HOME, DONA, ALTRE
    }
    
    public static void main(String[] args) {
        
        int edatEntrada = 0;
        char sexeEntrat;
        Sexe sexeDeLaPersona;
        int qtatTotalPersones = 0;
        int[] qtatTotalPerSexe = new int[3];
        int[] sumaEdatPerSexe = new int[3];
        int edatMesJove = 200;
        int edatMesVella = 0;

        do {
            edatEntrada = Llegir.enterPositiu("Entra l'edat de la persona: ");
            if (edatEntrada != 0) {
                if (edatEntrada > MAJOR_EDAT) {
                    do {
                        System.out.println("Entra el sexe de la persona (H per home, D per Dona o A per Altre): ");
                        sexeEntrat = teclat.next().charAt(0);
                        sexeEntrat = Character.toUpperCase(sexeEntrat);
                        if (sexeEntrat != 'H' && sexeEntrat != 'D' && sexeEntrat != 'A') {
                            System.err.println(
                                    "ERROR! Només pots entrar una de les opcions especifiques! H per home, D per Dona o A per Altre)");
                        }
                    } while (sexeEntrat != 'H' && sexeEntrat != 'D' && sexeEntrat != 'A');
                    switch (sexeEntrat) {
                        case 'H':
                            sexeDeLaPersona = Sexe.HOME;
                            qtatTotalPerSexe[0]++;
                            sumaEdatPerSexe[0] += edatEntrada;
                            break;
                        case 'D':
                            sexeDeLaPersona = Sexe.DONA;
                            qtatTotalPerSexe[1]++;
                            sumaEdatPerSexe[1] += edatEntrada;
                            break;
                        case 'A':
                            sexeDeLaPersona = Sexe.ALTRE;
                            qtatTotalPerSexe[2]++;
                            sumaEdatPerSexe[2] += edatEntrada;
                            break;
                    }

                    if (edatEntrada < edatMesJove) {
                        edatMesJove = edatEntrada;
                    }

                    if (edatEntrada > edatMesVella) {
                        edatMesVella = edatEntrada;
                    }
                } else {
                    System.out.println("No pot entrar!");
                }
            } else {
                System.out.println("Adeu!");
            }

        } while (edatEntrada != 0);

        // *) Nombre total de persones que assisteixen a la festa.
        System.out.println(
                "Han entrat " + (qtatTotalPerSexe[0] + qtatTotalPerSexe[1] + qtatTotalPerSexe[2]) + " persones!");

        // *) Nombre total d'homes, dones i altres.
        System.out.println("Han entrat " + qtatTotalPerSexe[0] + " homes!");
        System.out.println("Han entrat " + qtatTotalPerSexe[1] + " dones!");
        System.out.println("Han entrat " + qtatTotalPerSexe[2] + " altres!");

        // *) Mitjana de les edats per sexe.
        if (qtatTotalPerSexe[0] == 0) {
            System.out.print("La mitjana d'homes és: 0\n");
        } else {
            System.out.println("sumaEdatPerSexe[0] = " + sumaEdatPerSexe[0]);
            System.out.println("qtatTotalPerSexe[0] = " + qtatTotalPerSexe[0]);
            System.out.print("La mitjana d'homes és: " + (sumaEdatPerSexe[0] / qtatTotalPerSexe[0]) + "\n");
        }
        if (qtatTotalPerSexe[1] == 0) {
            System.out.print("La mitjana de dones és: 0\n");
        } else {
            System.out.print("La mitjana de dones és: " + (sumaEdatPerSexe[1] / qtatTotalPerSexe[1]) + "\n");
        }
        if (qtatTotalPerSexe[2] == 0) {
            System.out.print("La mitjana d'altres és: 0\n");
        } else {
            System.out.print("La mitjana d'altres és: " + (sumaEdatPerSexe[2] / qtatTotalPerSexe[2]) + "\n");
        }
        // *) Edat de la persona més jove i la més vella
        if(edatMesJove!=200){
            System.out.println("La persona més jove té " + edatMesJove + " anys!");
        }
        if(edatMesVella!=0){
            System.out.println("La persona més vella té " + edatMesVella + " anys!");
        }

    }
}
