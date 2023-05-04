import java.util.Calendar;
import java.util.GregorianCalendar;

public class PersonaApp {
    public static void main(String[] args) {
        Calendar dataNaix = new GregorianCalendar(1984,05,15);
        
        Persona pers1;
        
        pers1 = new Persona("Joan", "Pardo", "64598755", "joanpardo@ginebro.cat", dataNaix);
        
        pers1.setNom("Jordi");

        System.out.print("En " + pers1.getNom() + " té " + pers1.calculaEdat() + " anys!");
    }
}