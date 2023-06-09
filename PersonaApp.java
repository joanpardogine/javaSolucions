import java.time.LocalDate;

public class PersonaApp {
    public static void main(String[] args) {
        LocalDate dataNaix = LocalDate.of(1984,5,15);
        
        Persona pers1;
        Pacient pac1;
        
        pers1 = new Persona("Joan", "Pardo", "64598755", "joanpardo@ginebro.cat", dataNaix);
        pac1 = new Pacient("Joan", "Pardo", "64598755", "joanpardo@ginebro.cat", dataNaix,"malatia",3);
        
        pers1.setNom("Jordi");

        System.out.print("En " + pers1.getNom() + " té " + pers1.calculaEdat() + " anys!");
        
        System.out.print("En " + pac1.getNom() + " té " + pac1.calculaEdat() + " anys!");
    }
}
