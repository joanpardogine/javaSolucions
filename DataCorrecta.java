import java.util.Scanner;

import utils_joan.Dates; // Importem de la carpeta utils_joan, la Classe GestioDeMenus
import utils_joan.Llegir; // Importem de la carpeta utils_joan, la Classe GestioDeMenus

public class DataCorrecta {
    Scanner teclat = new Scanner(System.in);

    
    public static void main(String[] args) {
        int any;
        int mes;
        int dia;
        boolean anyEsDeTraspas;
        any = Llegir.enterPositiuInterval("Entra l'any: ",1900,2500);
        mes = Llegir.enterPositiuInterval("Entra el mes: ",1,12);
        dia = Llegir.enterPositiuInterval("Entra el dia: ",1,31);
        
        System.out.print("Has entrat " + dia + "/" + mes + "/" + any + "\n");
        if(anyEsDeTraspas=Dates.esDeTrespas(any)){
            System.out.print("I l'any " + any  + " és de traspas");
        } else {
            System.out.print("I l'any " + any  + " NO és de traspas");
        }
    }
}
